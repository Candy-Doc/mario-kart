package fr.ipponLille.menu;

import fr.ipponLille.menu.command.ChooseCharacter;
import fr.ipponLille.menu.command.ChooseKart;
import fr.ipponLille.menu.command.ChooseParachute;
import fr.ipponLille.menu.command.ChooseWheels;
import fr.ipponLille.menu.command.InitializeVehicle;
import fr.ipponLille.menu.command.ValidateVehicle;

public interface MenuService {
  void execute(ChooseCharacter chooseCharacter);

  void execute(InitializeVehicle initializeVehicle);

  void execute(ChooseKart chooseKart);

  void execute(ChooseWheels chooseWheels);

  void execute(ChooseParachute chooseParachute);

  void execute(ValidateVehicle validateVehicle);
}
