package fr.ipponLille.menu.event;

import fr.ipponLille.menu.PlayerId;

public abstract class ElementForPlayer {
  protected final PlayerId id;

  public ElementForPlayer(PlayerId id){
    this.id = id;
  }
}
