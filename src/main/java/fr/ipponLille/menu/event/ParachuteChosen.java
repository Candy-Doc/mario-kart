package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Parachute;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a parachute is chosen")
public class ParachuteChosen extends ElementForPlayer {

  private final Parachute parachute;

  public ParachuteChosen(PlayerId id, Parachute parachute) {
    super(id);
    this.parachute = parachute;
  }

//  public static ParachuteChosen of(PlayerId id, Parachute parachute){
//    return new ParachuteChosen(id, parachute);
//  }
}
