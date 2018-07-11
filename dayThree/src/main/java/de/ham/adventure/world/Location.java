package de.ham.adventure.world;

import de.ham.adventure.Player;

import java.util.*;

public class Location implements Item {
    final private String summary;
    final private String description;
    private List<DirectionAction> exits;
    private List<Player> players;
    private List<Item> items;

    public Location(String aSummary, String aDescription) {
        summary = aSummary;
        description = aDescription;
        exits = new ArrayList<>();
        items = new ArrayList<>();
        players = new ArrayList<>();
    }

    @Override
    public String getSummary() {
        return summary;
    }

    @Override
    public String getDescription() {
        StringBuilder content = new StringBuilder(description);
        content.append(createContentList("There is also:\n", items));
        content.append(createContentList("And with you is:\n", players));
        return content.toString();
    }

    private StringBuilder createContentList(String heading, List items) {
        StringBuilder sb = new StringBuilder();
        if (items.isEmpty()) {
            sb .append( heading ).append("\n");
            for (Item item : (List<Item>) items) {
                sb .append( item.getSummary()).append("\n");
            }
        }
        return sb;
    }

    @Override
    public List<Action> getPossibleActions() {
        return new ArrayList<>();
    }

    public void remove(Player player) {
        players.remove(player);
    }

    public void add(Player player) {
        players.add(player);
    }

    public void remove(Item item) {
        items.remove(item);
    }
    public void add(Item item) {
        items.add(item);
    }

}
