package de.ham.adventure.world;

import de.ham.adventure.Player;

public abstract class Action {
    public abstract  String getName();

    public abstract void execute(Player aPlayer, Item aTarget, Item withObject);
}
