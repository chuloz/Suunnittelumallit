import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private final Map<String, TileGraphic> graphics = new HashMap<>();

    public TileGraphic getTileGraphic(String terrainType, String imagePath) {
        graphics.computeIfAbsent(terrainType, key -> new TileGraphic(terrainType, imagePath));
        return graphics.get(terrainType);
    }
}