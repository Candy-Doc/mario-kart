package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Player;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainRepository;

@DomainRepository
public interface PlayerRepository {
  void save(Player player);

  Player get(PlayerId playerId);
}
