package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Name;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent(description = "When a character is chosen")
public class CharacterChosen extends ElementForPlayer {

  private final Name name;

  public CharacterChosen(PlayerId id, Name name) {
    super(id);
    this.name = name;
  }

//  public static CharacterChosen of(PlayerId id, Character character){
//    return new CharacterChosen(id, character);
//  }
}
