package de.ham.adventure.world;

import java.util.List;

public interface Item {
    String getSummary();
    String getDescription();
    List<Action> getPossibleActions();
}
