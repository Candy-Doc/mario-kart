package fr.ipponLille.menu;

import fr.ipponLille.menu.command.ChooseCharacter;
import fr.ipponLille.menu.command.ChooseKart;
import fr.ipponLille.menu.command.ChooseParachute;
import fr.ipponLille.menu.command.ChooseWheels;
import fr.ipponLille.menu.command.InitializeVehicle;
import fr.ipponLille.menu.event.CharacterChosen;
import fr.ipponLille.menu.event.KartChosen;
import fr.ipponLille.menu.event.ParachuteChosen;
import fr.ipponLille.menu.event.VehicleInitialized;
import fr.ipponLille.menu.event.WheelsChosen;
import fr.ipponLille.menu.repository.CharacterRepository;
import fr.ipponLille.menu.repository.KartRepository;
import fr.ipponLille.menu.repository.ParachuteRepository;
import fr.ipponLille.menu.repository.WheelsRepository;
import fr.ipponLille.sharedKernel.PlayerId;
import io.candydoc.ddd.annotations.Aggregate;

@Aggregate(name = "Player", description = "A player with a controller")
public class Player {
  private final PlayerId id;
  private Character character;
  private Vehicle vehicle;
  public Player(int id) {
    this.id = new PlayerId(id);
  }

  public CharacterChosen chooseCharacter(ChooseCharacter chooseCharacter, CharacterRepository characterRepository) {
    Character character = characterRepository.fromName(chooseCharacter.getName()).orElseThrow(() -> new IllegalArgumentException("Character doesn't exist"));
    this.character = character;
    return new CharacterChosen(this.id, character);
  }

  public VehicleInitialized initializeVehicle(InitializeVehicle initializeVehicle, KartRepository kartRepository, WheelsRepository wheelsRepository, ParachuteRepository parachuteRepository) {
    Kart kart = kartRepository.fromId(initializeVehicle.getKartId()).orElseThrow(() -> new IllegalArgumentException("Kart doesn't exist"));
    Wheels wheels = wheelsRepository.fromId(initializeVehicle.getWheelsId()).orElseThrow(() -> new IllegalArgumentException("Wheels doesn't exist"));
    Parachute parachute = parachuteRepository.fromId(initializeVehicle.getParachuteId()).orElseThrow(() -> new IllegalArgumentException("Parachute doesn't exist"));
    Vehicle vehicle = new Vehicle(kart, wheels, parachute);
    this.vehicle = vehicle;
    return new VehicleInitialized(this.id, vehicle);
  }

  public KartChosen chooseKart(ChooseKart chooseKart, KartRepository kartRepository) {
    Kart kart = kartRepository.fromId(chooseKart.getKartId()).orElseThrow(() -> new IllegalArgumentException("Kart doesn't exist"));
    this.vehicle.setKart(kart);
    return new KartChosen(this.id, kart);
  }

  public WheelsChosen chooseWheels(ChooseWheels chooseWheels, WheelsRepository wheelsRepository) {
    Wheels wheels = wheelsRepository.fromId(chooseWheels.getWheelsId()).orElseThrow(() -> new IllegalArgumentException("Wheels doesn't exist"));
    this.vehicle.setWheels(wheels);
    return new WheelsChosen(this.id, wheels);
  }

  public ParachuteChosen chooseParachute(ChooseParachute chooseParachute, ParachuteRepository parachuteRepository) {
    Parachute parachute = parachuteRepository.fromId(chooseParachute.getParachuteId()).orElseThrow(() -> new IllegalArgumentException("Parachute doesn't exist"));
    this.vehicle.setParachute(parachute);
    return new ParachuteChosen(this.id, parachute);
  }

  public PlayerId getId() {
    return id;
  }

  public Character getCharacter() {
    return character;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }
}
