package fr.ipponLille.menu;

import fr.ipponLille.model.ObjectWithStatistic;
import io.candydoc.ddd.annotations.DomainEntity;
import io.candydoc.ddd.annotations.ValueObject;

@DomainEntity
public class Kart extends ObjectWithStatistic {
  private final KartId kartId;

  public Kart(Stats stats, int id) {
    super(stats);
    this.kartId = new KartId(id);
  }

  public KartId getKartId() {
    return kartId;
  }
}
