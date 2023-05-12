package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.PlayerId;
import fr.ipponLille.menu.command.InitializeVehicle;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.VehicleInitialized;
import fr.ipponLille.menu.repository.KartRepository;
import fr.ipponLille.menu.repository.ParachuteRepository;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.menu.repository.WheelsRepository;

public class InitializeVehicleUseCase extends AbstractUseCase {
  private PlayerRepository playerRepository;
  private KartRepository kartRepository;
  private WheelsRepository wheelsRepository;
  private ParachuteRepository parachuteRepository;

  public InitializeVehicleUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository, KartRepository kartRepository, WheelsRepository wheelsRepository, ParachuteRepository parachuteRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
    this.kartRepository = kartRepository;
    this.wheelsRepository = wheelsRepository;
    this.parachuteRepository = parachuteRepository;
  }

  public void execute(InitializeVehicle initializeVehicle) {
    Player player = playerRepository.get(new PlayerId(initializeVehicle.getPlayerId()));
    VehicleInitialized vehicleInitialized = player.initializeVehicle(initializeVehicle, kartRepository, wheelsRepository, parachuteRepository);
    playerRepository.save(player);
    eventPublisher.publish(vehicleInitialized);
  }
}
