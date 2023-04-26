package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.PlayerId;

public interface PlayerRepository {
  public void save(Player player);

  Player get(PlayerId playerId);
}
