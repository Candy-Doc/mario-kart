package fr.ipponLille.menu.event;

import fr.ipponLille.menu.PlayerId;
import fr.ipponLille.menu.Vehicle;

public class VehicleValidated extends ElementForPlayer {
  private Vehicle vehicle;

  public VehicleValidated(PlayerId id, Vehicle vehicle) {
    super(id);
    this.vehicle = vehicle;
  }

  public static VehicleValidated of(PlayerId id, Vehicle vehicle){
    return new VehicleValidated(id, vehicle);
  }
}
