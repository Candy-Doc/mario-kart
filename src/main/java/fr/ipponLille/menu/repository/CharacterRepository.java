package fr.ipponLille.menu.repository;

import fr.ipponLille.menu.Character;

import java.util.Optional;

public interface CharacterRepository {
  public Optional<Character> fromName(String name);
}
