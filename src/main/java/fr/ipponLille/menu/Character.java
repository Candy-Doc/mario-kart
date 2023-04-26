package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Character {

  private final Name name;

  public Character(Name name) {
    this.name = name;
  }

  public Name getName() {
    return name;
  }
}
