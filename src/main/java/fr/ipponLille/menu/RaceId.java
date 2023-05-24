package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class RaceId {
  private final int id;

  public RaceId(int id) {
    this.id = id;
  }
}
