package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.DomainEntity;
import io.candydoc.ddd.annotations.ValueObject;

@DomainEntity
public class Character {

  private final Name name;

  public Character(Name name) {
    this.name = name;
  }

  public Name getName() {
    return name;
  }
}
