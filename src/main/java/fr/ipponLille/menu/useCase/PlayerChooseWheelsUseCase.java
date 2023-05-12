package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.PlayerId;
import fr.ipponLille.menu.command.ChooseWheels;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.WheelsChosen;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.menu.repository.WheelsRepository;

public class PlayerChooseWheelsUseCase extends AbstractUseCase {

  private final PlayerRepository playerRepository;
  private final WheelsRepository wheelsRepository;

  public PlayerChooseWheelsUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository, WheelsRepository wheelsRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
    this.wheelsRepository = wheelsRepository;
  }

  public void execute(ChooseWheels chooseWheels) {
    Player player = playerRepository.get(new PlayerId(chooseWheels.getPlayerId()));
    WheelsChosen wheelsChosen = player.chooseWheels(chooseWheels, wheelsRepository);
    playerRepository.save(player);
    eventPublisher.publish(wheelsChosen);
  }
}
