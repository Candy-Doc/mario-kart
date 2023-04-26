package fr.ipponLille.menu.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "A command to choose a parachute")
public class ChooseParachute {
  private final int playerId;

  private final int parachuteId;
  public ChooseParachute(int playerId, int parachuteId) {
    this.playerId = playerId;
    this.parachuteId = parachuteId;
  }

  public int getPlayerId() {
    return playerId;
  }

  public int getParachuteId() {
    return parachuteId;
  }
}
