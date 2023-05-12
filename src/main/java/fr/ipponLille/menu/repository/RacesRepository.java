package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.RaceId;

import java.util.List;
import java.util.Optional;

public interface RacesRepository {
  public Optional<List<RaceId>> fromCupId(int raceId);
}
