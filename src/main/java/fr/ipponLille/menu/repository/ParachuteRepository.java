package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Parachute;

import java.util.Optional;

public interface ParachuteRepository {
  public Optional<Parachute> fromId(int id);
}
