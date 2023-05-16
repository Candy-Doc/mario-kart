package fr.ipponLille.menu.useCase;

import fr.ipponLille.menu.Player;
import fr.ipponLille.menu.command.ValidateVehicle;
import fr.ipponLille.menu.event.EventPublisher;
import fr.ipponLille.menu.event.VehicleValidated;
import fr.ipponLille.menu.repository.PlayerRepository;
import fr.ipponLille.sharedKernel.PlayerId;

public class PlayerValidateVehicleUseCase extends AbstractUseCase {
  private final PlayerRepository playerRepository;

  public PlayerValidateVehicleUseCase(EventPublisher eventPublisher, PlayerRepository playerRepository) {
    super(eventPublisher);
    this.playerRepository = playerRepository;
  }

  public void execute(ValidateVehicle validateVehicle) {
    Player player = playerRepository.get(new PlayerId(validateVehicle.getPlayerId()));
    VehicleValidated vehicleValidated = new VehicleValidated(player.getId(), player.getVehicle());
    eventPublisher.publish(vehicleValidated);
  }
}
