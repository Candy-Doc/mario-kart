package fr.ipponLille.menu;

public class Name {
  private String value;

  public Name(String value) {
    this.value = value;
  }

  public static Name of(String value) {
    return new Name(value);
  }
}
