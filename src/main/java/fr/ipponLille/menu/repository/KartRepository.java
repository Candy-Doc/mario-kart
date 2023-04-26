package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Kart;

import java.util.Optional;

public interface KartRepository {
  public Optional<Kart> fromId(int id);

}
