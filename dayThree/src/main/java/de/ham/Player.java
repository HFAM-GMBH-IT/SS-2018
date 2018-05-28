package de.ham;

import de.ham.world.Action;
import de.ham.world.Item;
import de.ham.world.Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Item {
    private final List<Item> inventory;
    private final String name;
    private Weapon wieldedWeapon;
    private int health;
    private Location currentLocation;

    public Player(String aName, Location aLocation) {
        inventory = new ArrayList<>();
        health = 20;
        name = aName;
        currentLocation = aLocation;
    }

    public void consumeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.printf(name + " dies!");
    }

    @Override
    public String getSummary() {
        return name;
    }

    @Override
    public String getDescription() {
        return "This ia an ordinary creature.";
    }

    @Override
    public List<Action> getPossibleActions() {
        return Collections.emptyList();
    }

    public void move(Location location) {
        currentLocation.remove(this);
        location.add(this);
        currentLocation = location;
    }
}
