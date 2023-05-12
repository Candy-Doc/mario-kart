package fr.ipponLille.menu.event;

public interface EventPublisher {
  void publish(ElementForPlayer elementChosen);
  void publish(CupChosen cupChosen);
}
