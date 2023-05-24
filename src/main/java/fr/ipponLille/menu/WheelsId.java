package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class WheelsId {
  private final int id;

  public WheelsId(int wheelsId) {
    this.id = wheelsId;
  }
}
