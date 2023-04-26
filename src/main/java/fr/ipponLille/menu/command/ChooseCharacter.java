package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command to choose a character")
public class ChooseCharacter {
  private final int playerId;
  private final String characterName;

  public ChooseCharacter(int playerId, String characterName) {
    this.playerId = playerId;
    this.characterName = characterName;
  }

  public int getPlayerId() {
    return playerId;
  }

  public String getName() {
    return characterName;
  }
}
