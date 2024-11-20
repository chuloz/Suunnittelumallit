import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(640, 640);
        MapRenderer renderer = new MapRenderer(canvas);

        TileGraphicFactory factory = new TileGraphicFactory();
        Map map = new Map();

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                String terrainType = (Math.random() > 0.5) ? "Water" : "Forest";
                String imagePath = terrainType.equals("Water") ? "/resource/water.png" : "/resources/forest.png";
                Tile tile = new Tile(factory.getTileGraphic(terrainType, imagePath), x, y);
                map.addTile(tile);
            }
        }

        renderer.render(map);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, 640, 640);
        primaryStage.setScene(scene);
        primaryStage.setTitle("RPG Map");
        primaryStage.show();
    }

}