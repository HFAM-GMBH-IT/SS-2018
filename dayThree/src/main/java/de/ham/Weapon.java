package de.ham;

import de.ham.world.Item;

public abstract class Weapon implements Item {
    public abstract void doDamage(Player target);
}
