package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Wheels;

import java.util.Optional;

public interface WheelsRepository {
  Optional<Wheels> fromId(int kartId);
}
