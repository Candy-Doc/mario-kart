package fr.ipponLille.model;

import fr.ipponLille.menu.Stats;

public abstract class ObjectWithStatistic {

  protected Stats stats;

  protected ObjectWithStatistic() {
    stats = null;
  }

  protected ObjectWithStatistic(Stats stats) {
    this.stats = stats;
  }

  public Stats getStats() {
    return stats;
  }
}
