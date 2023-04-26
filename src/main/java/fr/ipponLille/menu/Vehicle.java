package fr.ipponLille.menu;

import fr.ipponLille.model.ObjectWithStatistic;
import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Vehicle extends ObjectWithStatistic {
  private Kart kart;
  private Wheels wheels;
  private Parachute parachute;

  public Vehicle(Kart kart, Wheels wheels, Parachute parachute) {
    this.kart = kart;
    this.wheels = wheels;
    this.parachute = parachute;
  }

  public void setKart(Kart kart) {
    this.kart = kart;
    computeStats();
  }

  public void setWheels(Wheels wheels) {
    this.wheels = wheels;
    computeStats();
  }

  public void setParachute(Parachute parachute) {
    this.parachute = parachute;
    computeStats();
  }

  private void computeStats() {
    int computedSpeed = kart.getStats().speed() + wheels.getStats().speed() + parachute.getStats().speed();
    int computedAcceleration = kart.getStats().acceleration() + wheels.getStats().acceleration() + parachute.getStats().acceleration();
    int computedWeight = kart.getStats().weight() + wheels.getStats().weight() + parachute.getStats().weight();
    int computedHandling = kart.getStats().handling() + wheels.getStats().handling() + parachute.getStats().handling();
    int computedGrip = kart.getStats().grip() + wheels.getStats().grip() + parachute.getStats().grip();

    this.stats = new Stats(computedSpeed, computedAcceleration, computedWeight, computedHandling, computedGrip);
  }
}
