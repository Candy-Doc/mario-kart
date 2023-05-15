package fr.ipponLille.race;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public record PlayerId(int id) {
}
