package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.command.ChooseCharacter;
import fr.ipponLille.menu.event.CharacterChosen;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.repository.CharacterRepository;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.sharedKernel.PlayerId;

public class PlayerChooseCharacterUseCase extends AbstractUseCase {
  private final PlayerRepository playerRepository;
  private final CharacterRepository characterRepository;

  public PlayerChooseCharacterUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository, CharacterRepository characterRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
    this.characterRepository = characterRepository;
  }

  public void execute(ChooseCharacter chooseCharacter) {
    Player player = playerRepository.get(new PlayerId(chooseCharacter.getPlayerId()));
    CharacterChosen characterChosen = player.chooseCharacter(chooseCharacter, characterRepository);
    playerRepository.save(player);
    eventPublisher.publish(characterChosen);
  }
}
