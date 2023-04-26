package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command to choose a kart")
public class ChooseKart {

  private final int playerId;

  private final int kartId;
  public ChooseKart(int playerId, int kartId) {
    this.playerId = playerId;
    this.kartId = kartId;
  }

  public int getPlayerId() {
    return playerId;
  }

  public int getKartId() {
    return kartId;
  }
}
