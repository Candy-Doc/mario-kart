package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class KartId {

  private final int id;

  public KartId(int id) {
    this.id = id;
  }
}
