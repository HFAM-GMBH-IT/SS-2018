package de.ham.world;

import de.ham.Player;

public abstract class Action {
    public abstract  String getName();

    public abstract void execute(Player aPlayer, Item aTarget, Item withObject);
}
