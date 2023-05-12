package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.Aggregate;

import java.util.ArrayList;
import java.util.List;

@Aggregate(name = "Cup", description = "Cup handler")
public class Cup {
  private final CupId id;
  private List<RaceId> races = new ArrayList<>();

  public Cup(int id) {
    this.id = new CupId(id);
  }
}
