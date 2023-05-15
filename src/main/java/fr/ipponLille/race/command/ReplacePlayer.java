package fr.ipponLille.race.command;

import io.candydoc.ddd.annotations.DomainCommand;

@DomainCommand(description = "Replace the player when event fall is receive")
public record ReplacePlayer(int playerId) {
}
