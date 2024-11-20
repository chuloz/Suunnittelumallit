public class Tile {
    private final TileGraphic graphic;
    private final int x;
    private final int y;

    public Tile(TileGraphic graphic, int x, int y) {
        this.graphic = graphic;
        this.x = x;
        this.y = y;
    }

    public TileGraphic getGraphic() {
        return graphic;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}