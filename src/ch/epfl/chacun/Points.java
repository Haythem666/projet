package ch.epfl.chacun;

public final class Points {
    int forClosedForest(int tileCount, int mushroomGroupCount) {
        Preconditions.checkArgument(tileCount > 1);
        Preconditions.checkArgument(mushroomGroupCount >= 0);

        return 2 * tileCount + 3 * mushroomGroupCount;

    }

    int forClosedRiver(int tileCount, int fishCount) {
        Preconditions.checkArgument(tileCount > 1);
        Preconditions.checkArgument(fishCount >= 0);

        return tileCount + fishCount;
    }

    int forMeadow(int mammothCount, int aurochsCount, int deerCount) {
        Preconditions.checkArgument(mammothCount >= 0);
        Preconditions.checkArgument(aurochsCount >= 0);
        Preconditions.checkArgument(deerCount >= 0);

        return 3 * mammothCount + 2 * aurochsCount + deerCount;
    }

    int forRiverSystem(int fishCount) {
        Preconditions.checkArgument(fishCount >= 0);

        return fishCount;
    }

    int forLogboat(int lakeCount) {
        Preconditions.checkArgument(lakeCount > 0);

        return lakeCount * 2;
    }

    int forRaft(int lakeCount) {
        Preconditions.checkArgument(lakeCount > 0);

        return lakeCount;
    }
}
