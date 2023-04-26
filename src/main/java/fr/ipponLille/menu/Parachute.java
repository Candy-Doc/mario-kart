package fr.ipponLille.menu;

import fr.ipponLille.model.ObjectWithStatistic;
import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Parachute extends ObjectWithStatistic {
  private ParachuteId parachuteId;
  public Parachute(Stats stats, int id) {
    super(stats);
    this.parachuteId = new ParachuteId(id);
  }
}
