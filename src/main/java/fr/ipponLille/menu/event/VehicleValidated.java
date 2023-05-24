package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Vehicle;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent
public class VehicleValidated extends ElementForPlayer {

  public VehicleValidated(PlayerId id) {
    super(id);
  }

//  public static VehicleValidated of(PlayerId id, Vehicle vehicle){
//    return new VehicleValidated(id, vehicle);
//  }
}
