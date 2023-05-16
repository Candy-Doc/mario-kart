package fr.ipponLille.menu;

import io.candydoc.ddd.annotations.ValueObject;

@ValueObject
public class Stats {
  private int speed;

  private int acceleration;
  private int weight;
  private int handling;
  private int grip;

  public Stats(int speed, int acceleration, int weight, int handling, int grip) {
    this.speed = speed;
    this.acceleration = acceleration;
    this.weight = weight;
    this.handling = handling;
    this.grip = grip;
  }

  public int speed() {
    return speed;
  }

  public int acceleration() {
    return acceleration;
  }

  public int weight() {
    return weight;
  }

  public int handling() {
    return handling;
  }

  public int grip() {
    return grip;
  }
}
