package fr.ipponLille.menu.event;

import fr.ipponLille.sharedKernel.PlayerId;

public abstract class ElementForPlayer {
  protected final PlayerId id;

  public ElementForPlayer(PlayerId id){
    this.id = id;
  }
}
