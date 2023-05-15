package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.event.EventPublisher;

public abstract class AbstractUseCase {
  protected EventPublisher eventPublisher;

  public AbstractUseCase(EventPublisher eventPublisher) {
    this.eventPublisher = eventPublisher;
  }
}
