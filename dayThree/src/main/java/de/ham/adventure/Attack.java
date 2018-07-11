package de.ham.adventure;

import de.ham.adventure.world.Action;
import de.ham.adventure.world.Item;

public class Attack extends Action {
    public String getName() {
        return "Attack";
    }

    public void execute(Player target, Item weapon) {
        weapon.doDamage(target);
    }
}
