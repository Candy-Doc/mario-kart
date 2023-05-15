package fr.ipponLille.race.repository;

import fr.ipponLille.race.PlayerId;
import fr.ipponLille.race.Player;

import java.util.Optional;

public interface PlayerRepository {
  Optional<Player> fromId(PlayerId playerId);

  void save(Player player);
}
