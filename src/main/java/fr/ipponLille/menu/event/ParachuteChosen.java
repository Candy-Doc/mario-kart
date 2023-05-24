package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Parachute;
import fr.ipponLille.menu.ParachuteId;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a parachute is chosen")
public class ParachuteChosen extends ElementForPlayer {

  private final ParachuteId parachuteId;

  public ParachuteChosen(PlayerId id, ParachuteId parachuteId) {
    super(id);
    this.parachuteId = parachuteId;
  }

//  public static ParachuteChosen of(PlayerId id, Parachute parachute){
//    return new ParachuteChosen(id, parachute);
//  }
}
