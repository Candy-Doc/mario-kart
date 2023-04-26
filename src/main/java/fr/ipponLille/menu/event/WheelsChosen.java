package fr.ipponLille.menu.event;

import fr.ipponLille.menu.PlayerId;
import fr.ipponLille.menu.Wheels;

public class WheelsChosen extends ElementForPlayer {
  private final Wheels wheels;

  public WheelsChosen(PlayerId id, Wheels wheels) {
    super(id);
    this.wheels = wheels;
  }

  public static WheelsChosen of(PlayerId id, Wheels wheels){
    return new WheelsChosen(id, wheels);
  }
}
