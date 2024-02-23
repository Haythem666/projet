package ch.epfl.chacun;

import java.util.List;

public sealed interface Zone {
    enum SpecialPower {
        SHAMAN,
        LOGBOAT,
        HAUNTING_TRAP,
        PIT_TRAP,
        WILD_FIRE,
        RAFT,
    }

    static int tileId(int zoneId) {
        return zoneId / 10;
    }

    static int localId(int zoneId) {
        return zoneId % 10;
    }

    int id();

    default int tileId() {
        return id() / 10;
    }

    default int localId() {
        return id() % 10;
    }

    default SpecialPower specialPower() {
        return null;
    }

    record Forest(int id, Kind kind) implements Zone {
        public enum Kind {
            PLAIN, WITH_MENHIR, WITH_MUSHROOMS
        }
    }

    record Meadow(int id, List<Animal> animals, SpecialPower specialPower) {
        public Meadow {
            animals = List.copyOf(animals);
        }
    }

    sealed interface Water extends Zone {
        int fishCount();
    }

    record Lake(int id, int fishCount, SpecialPower specialPower) implements Zone {

        @Override
        public int id() {
            return 8;
        }
    }

    record River(int id, int fishCount, Lake lake) implements Water {
        public boolean hasLake() {
            return lake != null;
        }
    }

}
