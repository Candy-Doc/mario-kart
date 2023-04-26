package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Kart;
import fr.ipponLille.menu.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a kart is chosen")
public class KartChosen extends ElementForPlayer {

  private final Kart kart;

  public KartChosen(PlayerId id, Kart kart) {
    super(id);
    this.kart = kart;
  }

  public static KartChosen of(PlayerId id, Kart kart){
    return new KartChosen(id, kart);
  }
}
