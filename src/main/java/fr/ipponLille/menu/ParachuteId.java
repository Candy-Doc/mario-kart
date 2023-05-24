package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class ParachuteId {
  private final int id;

  public ParachuteId(int id) {
    this.id = id;
  }
}
