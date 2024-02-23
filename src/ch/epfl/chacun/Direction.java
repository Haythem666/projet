package ch.epfl.chacun;

import java.util.List;

public enum Direction {
    N, E, S, W;
    public static final List<Direction> ALL = List.of(values());
    public static final int COUNT = ALL.size();

    public Direction rotated(Rotation rotation) {
        int rotatedIndex = (this.ordinal() + rotation.ordinal()) % COUNT;
        return Direction.ALL.get(rotatedIndex);
    }

    public Direction opposite() {
        int oppositeIndex = (this.ordinal() + 2) % COUNT;
        return Direction.ALL.get(oppositeIndex);
    }
}
