import java.util.Arrays;
import java.util.List;

public class CityMap extends Map {

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        List<Tile> cityTiles = Arrays.asList(new RoadTile(), new ForestTile(), new BuildingTile());
        return cityTiles.get(random.nextInt(cityTiles.size()));
    }
}