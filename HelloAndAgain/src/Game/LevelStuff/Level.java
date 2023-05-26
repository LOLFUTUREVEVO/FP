package Game.LevelStuff;

import processing.core.PImage;

public class Level {
    private int size;
    private PImage[] TileSet;
    public Level() {

    }




    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PImage[] getTileSet() {
        return TileSet;
    }

    public void setTileSet(PImage[] tileSet) {
        TileSet = tileSet;
    }
}
