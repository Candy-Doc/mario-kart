package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.CupId;
import fr.ipponLille.menu.RaceId;
import fr.ipponLille.menu.command.ChooseCup;
import fr.ipponLille.menu.event.CupChosen;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.repository.RacesRepository;

import java.util.List;

public class ChooseCupUseCase extends AbstractUseCase {
  private RacesRepository racesRepository;

  public ChooseCupUseCase(EventPublisher eventPublisher, RacesRepository racesRepository) {
    super(eventPublisher);
    this.racesRepository = racesRepository;
  }

  public void execute(ChooseCup chooseCup) {
    List<RaceId> races = racesRepository.fromCupId(chooseCup.getCupId()).orElseThrow(() -> new IllegalArgumentException("Cup doesn't exist"));
    CupChosen cupChosen = new CupChosen(new CupId(chooseCup.getCupId()), races);
    eventPublisher.publish(cupChosen);
  }
}
