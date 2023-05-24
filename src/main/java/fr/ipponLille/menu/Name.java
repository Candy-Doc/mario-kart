package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Name {
  private String value;

  public Name(String value) {
    this.value = value;
  }

}
