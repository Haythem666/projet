package ch.epfl.chacun;

import java.util.List;

public enum Rotation {
    NONE, RIGHT, HALF_TURN, LEFT;
    public static final List<Rotation> ALL = List.of(values());
    public static final int COUNT = ALL.size();

    public Rotation add(Rotation that) {
        int sum = (this.ordinal() + that.ordinal()) % COUNT;
        return Rotation.ALL.get(sum);

    }

    public Rotation negated() {
        int negatedIndex = ((COUNT - this.ordinal()) % COUNT);
        return Rotation.ALL.get(negatedIndex);
    }

    public int quarterTurnsCW() {
        return this.ordinal();
    }

    public int degreesCW() {
        return this.ordinal() * 90;
    }
}
