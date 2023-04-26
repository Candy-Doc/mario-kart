package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command to choose wheels")

public class ChooseWheels {
  private final int playerId;

  private final int wheelsId;

  public ChooseWheels(int playerId, int wheelsId) {
    this.playerId = playerId;
    this.wheelsId = wheelsId;
  }

  public int getPlayerId() {
    return playerId;
  }

  public int getWheelsId() {
    return wheelsId;
  }
}
