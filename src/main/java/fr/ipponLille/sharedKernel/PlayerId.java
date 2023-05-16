package fr.ipponLille.sharedKernel;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class PlayerId{
  private int playerId;

  public PlayerId(int playerId) {
    this.playerId = playerId;
  }

  public int playerId(){
    return this.playerId;
  }
}
