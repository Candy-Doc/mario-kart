package fr.ipponLille.race.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "Replace the player when event fall is receive")
public class ReplacePlayer {
  private int playerId;

  public ReplacePlayer(int playerId) {
    this.playerId = playerId;
  }

  public int playerId(){
    return this.playerId;
  }
}
