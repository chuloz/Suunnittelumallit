import javafx.scene.image.Image;

public class TileGraphic {
    private final String terrainType;
    private final Image image;

    public TileGraphic(String terrainType, String imagePath) {
        this.terrainType = terrainType;
        this.image = new Image(imagePath);
    }

    public String getTerrainType() {
        return terrainType;
    }

    public Image getImage() {
        return image;
    }
}