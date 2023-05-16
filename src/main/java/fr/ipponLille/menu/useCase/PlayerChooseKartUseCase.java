package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.command.ChooseKart;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.KartChosen;
import fr.ipponLille.menu.repository.KartRepository;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.sharedKernel.PlayerId;

public class PlayerChooseKartUseCase extends AbstractUseCase {

  private final PlayerRepository playerRepository;
  private final KartRepository kartRepository;

  public PlayerChooseKartUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository, KartRepository kartRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
    this.kartRepository = kartRepository;
  }

  public void execute(ChooseKart chooseKart) {
    Player player = playerRepository.get(new PlayerId(chooseKart.getPlayerId()));
    KartChosen kartChosen = player.chooseKart(chooseKart, kartRepository);
    playerRepository.save(player);
    eventPublisher.publish(kartChosen);
  }
}
