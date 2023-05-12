package fr.ipponLille.menu;

import fr.ipponLille.menu.command.ChooseCup;
import fr.ipponLille.menu.event.CharacterChosen;
import fr.ipponLille.menu.event.CupChosen;
import fr.ipponLille.menu.repository.RacesRepository;
import io.candydoc.ddd.annotations.Aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Aggregate(name = "Cup", description = "Cup handler")
public class Cup {
  private final CupId id;
  private List<RaceId> races = new ArrayList<>();

  public Cup(int id) {
    this.id = new CupId(id);
  };
}
