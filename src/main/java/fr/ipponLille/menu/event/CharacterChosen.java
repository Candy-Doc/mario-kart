package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Character;
import fr.ipponLille.menu.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a character is chosen")
public class CharacterChosen extends ElementForPlayer {

  private final Character character;

  public CharacterChosen(PlayerId id, Character character) {
    super(id);
    this.character = character;
  }

  public static CharacterChosen of(PlayerId id, Character character){
    return new CharacterChosen(id, character);
  }
}
