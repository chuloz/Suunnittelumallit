import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class MapRenderer {
    private final Canvas canvas;

    public MapRenderer(Canvas canvas) {
        this.canvas = canvas;
    }

    public void render(Map map) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (Tile tile : map.getTiles()) {
            TileGraphic graphic = tile.getGraphic();
            gc.drawImage(graphic.getImage(), tile.getX() * 32, tile.getY() * 32);
        }
    }
}