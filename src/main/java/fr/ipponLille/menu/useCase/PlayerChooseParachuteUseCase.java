package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.PlayerId;
import fr.ipponLille.menu.command.ChooseParachute;
import fr.ipponLille.menu.command.ChooseWheels;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.ParachuteChosen;
import fr.ipponLille.menu.event.WheelsChosen;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.menu.repository.ParachuteRepository;

public class PlayerChooseParachuteUseCase extends AbstractUseCase {

  private final PlayerRepository playerRepository;
  private final ParachuteRepository ParachuteRepository;

  public PlayerChooseParachuteUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository, ParachuteRepository ParachuteRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
    this.ParachuteRepository = ParachuteRepository;
  }

  public void execute(ChooseParachute chooseParachute) {
    Player player = playerRepository.get(new PlayerId(chooseParachute.getPlayerId()));
    ParachuteChosen parachuteChosen = player.chooseParachute(chooseParachute, ParachuteRepository);
    playerRepository.save(player);
    eventPublisher.publish(parachuteChosen);
  }
}
