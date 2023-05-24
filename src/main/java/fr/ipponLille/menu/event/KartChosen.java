package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Kart;
import fr.ipponLille.menu.KartId;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a kart is chosen")
public class KartChosen extends ElementForPlayer {

  private final KartId kartId;

  public KartChosen(PlayerId id, KartId kartId) {
    super(id);
    this.kartId = kartId;
  }

//  public static KartChosen of(PlayerId id, Kart kart){
//    return new KartChosen(id, kart);
//  }
}
