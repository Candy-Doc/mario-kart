package fr.ipponLille.race;

import fr.ipponLille.race.command.ReplacePlayer;
import fr.ipponLille.race.event.PlayerFallen;
import fr.ipponLille.race.repository.PlayerRepository;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.Aggregate;

import java.util.List;

@Aggregate
public class Race {
  private Rank rank;
  private List<Player> players;
  private Track track;

  public Race(Rank rank, List<Player> players, Track track) {
    this.rank = rank;
    this.players = players;
    this.track = track;
  }

  public PlayerFallen playerFallen(PlayerId playerId){
    return new PlayerFallen(playerId);
  }

  public void replacePlayer(ReplacePlayer replacePlayer, PlayerRepository playerRepository){
    Player player = playerRepository.fromId(new PlayerId(replacePlayer.playerId())).orElseThrow(() -> new IllegalArgumentException("Player doesn't exist"));
    player.replace();
    playerRepository.save(player);
  }
}
