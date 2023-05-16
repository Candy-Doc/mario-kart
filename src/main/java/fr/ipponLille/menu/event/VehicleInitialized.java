package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Vehicle;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent()
public class VehicleInitialized extends ElementForPlayer{
  private final Vehicle vehicle;

  public VehicleInitialized(PlayerId id, Vehicle vehicle) {
    super(id);
    this.vehicle = vehicle;
  }

//  public static VehicleInitialized of(PlayerId id, Vehicle vehicle){
//    return new VehicleInitialized(id, vehicle);
//  }
}
