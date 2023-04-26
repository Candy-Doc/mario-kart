package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public record Stats(int speed, int acceleration, int weight, int handling, int grip) {
}
