package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public record PlayerId(int id) {
}
