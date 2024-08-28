import java.util.Arrays;
import java.util.List;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        List<Tile> wildernessTiles = Arrays.asList(new SwampTile(), new WaterTile(), new ForestTile());
        return wildernessTiles.get(random.nextInt(wildernessTiles.size()));
    }
}