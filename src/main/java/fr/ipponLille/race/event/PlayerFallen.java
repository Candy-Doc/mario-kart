package fr.ipponLille.race.event;

import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a player fall")
public class PlayerFallen {
  private PlayerId playerId;

  public PlayerFallen(PlayerId playerId) {
    this.playerId = playerId;
  }

//  public static PlayerFallen of(PlayerId playerId){
//    return new PlayerFallen(playerId);
//  }
}
