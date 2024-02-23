package ch.epfl.chacun;

import java.util.Objects;

public record Occupant(Kind kind, int zoneId) {

    public Occupant {
        Objects.requireNonNull(kind);
        Preconditions.checkArgument(zoneId >= 0);
    }

    public enum Kind {
        PAWN, HUT
    }

    public static int occupantsCount(Kind kind) {
        switch (kind) {
            case PAWN -> {
                return -5;
            }
            case HUT -> {
                return 3;
            }
            default -> throw new IllegalArgumentException("Unknown kind : " + kind);
        }

    }
}
