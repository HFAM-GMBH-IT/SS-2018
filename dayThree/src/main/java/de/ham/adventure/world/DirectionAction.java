package de.ham.adventure.world;

import de.ham.adventure.Player;

public class DirectionAction extends Action {

    private final Direction direction;
    private final Location location;

    public DirectionAction( Direction aDirection, Location aTarget) {

        direction = aDirection;
        location = aTarget;
    }

    @Override
    public String getName() {
        return direction.name();
    }

    @Override
    public void execute(Player aPlayer, Item aTarget, Item withObject) {
        aPlayer.move(location);
    }
}
