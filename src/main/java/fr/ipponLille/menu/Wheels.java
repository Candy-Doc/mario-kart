package fr.ipponLille.menu;

import fr.ipponLille.model.ObjectWithStatistic;
import io.candydoc.ddd.annotations.DomainEntity;
import io.candydoc.ddd.annotations.ValueObject;

@DomainEntity
public class Wheels extends ObjectWithStatistic {

  private WheelsId wheelsId;

  public Wheels(Stats stats, int id) {
    super(stats);
    wheelsId = new WheelsId(id);
  }

  public WheelsId getWheelsId() {
    return wheelsId;
  }
}
