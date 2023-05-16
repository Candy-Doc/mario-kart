package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Wheels;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When wheels are chosen")
public class WheelsChosen extends ElementForPlayer {
  private final Wheels wheels;

  public WheelsChosen(PlayerId id, Wheels wheels) {
    super(id);
    this.wheels = wheels;
  }

//  public static WheelsChosen of(PlayerId id, Wheels wheels){
//    return new WheelsChosen(id, wheels);
//  }
}
