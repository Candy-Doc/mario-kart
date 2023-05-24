package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class CupId {
  private final int id;

  public CupId(int cupId) {
    this.id = cupId;
  }
}
