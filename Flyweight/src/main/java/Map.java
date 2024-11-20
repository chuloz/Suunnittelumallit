import java.util.ArrayList;
import java.util.List;

public class Map {
    private final List<Tile> tiles = new ArrayList<>();

    public void addTile(Tile tile) {
        tiles.add(tile);
    }

    public List<Tile> getTiles() {
        return tiles;
    }
}