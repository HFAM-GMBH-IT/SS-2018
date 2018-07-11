package de.ham.adventure;

import de.ham.adventure.world.Item;

public abstract class Weapon implements Item {
    public abstract void doDamage(Player target);
}
