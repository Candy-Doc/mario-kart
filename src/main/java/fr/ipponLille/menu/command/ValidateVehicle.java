package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command when a player validate his vehicle")

public class ValidateVehicle {
  private final int playerId;

  public ValidateVehicle(int playerId){
    this.playerId = playerId;
  }

  public int getPlayerId() {
    return playerId;
  }
}
