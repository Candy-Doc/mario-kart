package fr.ipponLille.sharedKernel;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public record PlayerId(int id) {
}
