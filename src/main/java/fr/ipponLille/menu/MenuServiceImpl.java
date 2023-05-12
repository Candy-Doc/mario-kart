package fr.ipponLille.menu;

import fr.ipponLille.menu.command.ChooseCharacter;
import fr.ipponLille.menu.command.ChooseKart;
import fr.ipponLille.menu.command.ChooseParachute;
import fr.ipponLille.menu.command.ChooseWheels;
import fr.ipponLille.menu.command.ChooseCup;
import fr.ipponLille.menu.command.InitializeVehicle;
import fr.ipponLille.menu.command.ValidateVehicle;
import fr.ipponLille.menu.event.CharacterChosen;
import fr.ipponLille.menu.event.CupChosen;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.KartChosen;
import fr.ipponLille.menu.event.ParachuteChosen;
import fr.ipponLille.menu.event.VehicleInitialized;
import fr.ipponLille.menu.event.VehicleValidated;
import fr.ipponLille.menu.event.WheelsChosen;
import fr.ipponLille.menu.repository.CharacterRepository;
import fr.ipponLille.menu.repository.CupRepository;
import fr.ipponLille.menu.repository.KartRepository;
import fr.ipponLille.menu.repository.ParachuteRepository;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.menu.repository.RacesRepository;
import fr.ipponLille.menu.repository.WheelsRepository;

import java.util.List;

public class MenuServiceImpl implements MenuService {
  private final CharacterRepository characterRepository;
  private final PlayerRepository playerRepository;
  private final KartRepository kartRepository;
  private final WheelsRepository wheelsRepository;
  private final ParachuteRepository parachuteRepository;
  private final CupRepository cupRepository;
  private final RacesRepository racesRepository;
  private final EventPublisher eventPublisher;

  public MenuServiceImpl(CharacterRepository characterRepository, PlayerRepository playerRepository, KartRepository kartRepository, WheelsRepository wheelsRepository, ParachuteRepository parachuteRepository, CupRepository cupRepository, RacesRepository racesRepository, EventPublisher eventPublisher) {
    this.characterRepository = characterRepository;
    this.playerRepository = playerRepository;
    this.kartRepository = kartRepository;
    this.wheelsRepository = wheelsRepository;
    this.parachuteRepository = parachuteRepository;
    this.cupRepository = cupRepository;
    this.racesRepository = racesRepository;
    this.eventPublisher = eventPublisher;
  }

  @Override
  public void execute(ChooseCharacter chooseCharacter) {
    Player player = playerRepository.get(new PlayerId(chooseCharacter.getPlayerId()));
    CharacterChosen characterChosen = player.chooseCharacter(chooseCharacter, characterRepository);
    playerRepository.save(player);
    eventPublisher.publish(characterChosen);
  }

  @Override
  public void execute(InitializeVehicle initializeVehicle) {
    Player player = playerRepository.get(new PlayerId(initializeVehicle.getPlayerId()));
    VehicleInitialized vehicleInitialized = player.initializeVehicle(initializeVehicle, kartRepository, wheelsRepository, parachuteRepository);
    playerRepository.save(player);
    eventPublisher.publish(vehicleInitialized);
  }

  @Override
  public void execute(ChooseKart chooseKart) {
    Player player = playerRepository.get(new PlayerId(chooseKart.getPlayerId()));
    KartChosen kartChosen = player.chooseKart(chooseKart, kartRepository);
    playerRepository.save(player);
    eventPublisher.publish(kartChosen);
  }

  @Override
  public void execute(ChooseWheels chooseWheels) {
    Player player = playerRepository.get(new PlayerId(chooseWheels.getPlayerId()));
    WheelsChosen wheelsChosen = player.chooseWheels(chooseWheels, wheelsRepository);
    playerRepository.save(player);
    eventPublisher.publish(wheelsChosen);
  }

  @Override
  public void execute(ChooseParachute chooseParachute) {
    Player player = playerRepository.get(new PlayerId(chooseParachute.getPlayerId()));
    ParachuteChosen parachuteChosen = player.chooseParachute(chooseParachute, parachuteRepository);
    playerRepository.save(player);
    eventPublisher.publish(parachuteChosen);
  }

  @Override
  public void execute(ValidateVehicle validateVehicle) {
    Player player = playerRepository.get(new PlayerId(validateVehicle.getPlayerId()));
    VehicleValidated vehicleValidated = VehicleValidated.of(player.getId(), player.getVehicle());
    eventPublisher.publish(vehicleValidated);
  }

  @Override
  public void execute(ChooseCup chooseCup) {
    List<RaceId> races = racesRepository.fromCupId(chooseCup.getCupId()).orElseThrow(() -> new IllegalArgumentException("Cup doesn't exist"));
    CupChosen cupChosen = CupChosen.of(new CupId(chooseCup.getCupId()), races);
    eventPublisher.publish(cupChosen);
  }
}
