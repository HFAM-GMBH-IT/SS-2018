package de.ham;

import de.ham.world.Action;

import java.util.ArrayList;
import java.util.List;

public class Sword extends Weapon {

    private final List<Action> actions;
    private final int damage;

    public Sword() {
        actions = new ArrayList<>();
        actions.add(new Attack());
        damage = 7;
    }

    public String getSummary() {
        return "A small sword";
    }

    public String getDescription() {
        return "This sword may have seen Roman times!";
    }

    public List<Action> getPossibleActions() {
        return actions;
    }

    public void doDamage(Player target) {
        target.consumeDamage(damage);
    }
}
