package ch.epfl.chacun;

public record Animal(int id, Occupant.Kind kind) {
    public enum Kind {
        MAMMOTH, AUROCHS, DEER, TIGER
    }


    public int tileId() {
        return id / 100;
    }
}
