package de.ham;

import de.ham.world.Action;
import de.ham.world.Item;

public class Attack extends Action {
    public String getName() {
        return "Attack";
    }

    public void execute(Player target, Item weapon) {
        weapon.doDamage(target);
    }
}
