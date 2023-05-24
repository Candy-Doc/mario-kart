package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Wheels;
import fr.ipponLille.menu.WheelsId;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When wheels are chosen")
public class WheelsChosen extends ElementForPlayer {
  private final WheelsId wheelsId;

  public WheelsChosen(PlayerId id, WheelsId wheelsId) {
    super(id);
    this.wheelsId = wheelsId;
  }

//  public static WheelsChosen of(PlayerId id, Wheels wheels){
//    return new WheelsChosen(id, wheels);
//  }
}
