package fr.ipponLille.menu.event;

import fr.ipponLille.menu.CupId;
import fr.ipponLille.menu.RaceId;
import io.candydoc.ddd.annotations.DomainEvent;

import java.util.List;

@DomainEvent
public class CupChosen {
  private final CupId cupId;
  List<RaceId> races;

  public CupChosen(CupId cupId, List<RaceId> races) {
    this.cupId = cupId;
    this.races = races;
  }

//  public static CupChosen of(CupId cupId, List<RaceId> races){
//    return new CupChosen(cupId, races);
//  }
}
