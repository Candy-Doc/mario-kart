package fr.ipponLille.menu;

import fr.ipponLille.model.ObjectWithStatistic;
import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Kart extends ObjectWithStatistic {
  private final KartId kartId;

  public Kart(Stats stats, int id) {
    super(stats);
    this.kartId = new KartId(id);
  }
}
