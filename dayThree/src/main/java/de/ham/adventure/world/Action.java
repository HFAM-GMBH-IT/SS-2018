package de.ham.adventure.world;

import de.ham.adventure.Player;
import de.ham.adventure.Weapon;

public abstract class Action {
    public abstract  String getName();

    public abstract void execute(Player aPlayer, Weapon aTarget, Item withObject);
}
