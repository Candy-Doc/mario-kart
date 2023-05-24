package fr.ipponLille.menu.event;

import fr.ipponLille.menu.Vehicle;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.DomainEvent;

@DomainEvent()
public class VehicleInitialized extends ElementForPlayer{

  public VehicleInitialized(PlayerId id) {
    super(id);
  }

//  public static VehicleInitialized of(PlayerId id, Vehicle vehicle){
//    return new VehicleInitialized(id, vehicle);
//  }
}
