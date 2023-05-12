package fr.ipponLille.menu.event;

public interface EventPublisher {
  public void publish(ElementForPlayer elementChosen);
  public void publish(CupChosen cupChosen);
}
