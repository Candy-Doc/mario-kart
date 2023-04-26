package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command to initialized a vehicle")
public class InitializeVehicle {
  private final int playerId;
  private final int kartId;
  private final int wheelsId;
  private final int parachuteId;

  public InitializeVehicle(int playerId, int kartId, int wheelsId, int parachuteId) {
    this.playerId = playerId;
    this.kartId = kartId;
    this.wheelsId = wheelsId;
    this.parachuteId = parachuteId;
  }

  public int getPlayerId() {
    return playerId;
  }

  public int getKartId() {
    return kartId;
  }

  public int getWheelsId() {
    return wheelsId;
  }

  public int getParachuteId() {
    return parachuteId;
  }
}
