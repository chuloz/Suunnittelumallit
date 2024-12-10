import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PixelArtEditor extends Application {

    private static final int GRID_SIZE = 8;
    private static final int CELL_SIZE = 50;

    private int cursorX = 0;
    private int cursorY = 0;
    private boolean[][] grid = new boolean[GRID_SIZE][GRID_SIZE];
    private Rectangle[][] cells = new Rectangle[GRID_SIZE][GRID_SIZE];

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = createGridPane();
        Button generateCodeButton = new Button("Generate Code");
        generateCodeButton.setOnAction(event -> generateJavaCode());

        VBox root = new VBox(gridPane, generateCodeButton);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                moveCursorUp();
            } else if (event.getCode() == KeyCode.DOWN) {
                moveCursorDown();
            } else if (event.getCode() == KeyCode.LEFT) {
                moveCursorLeft();
            } else if (event.getCode() == KeyCode.RIGHT) {
                moveCursorRight();
            } else if (event.getCode() == KeyCode.SPACE) {
                togglePixel();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.show();
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
                cell.setFill(Color.WHITE);
                cell.setStroke(Color.BLACK);
                cells[y][x] = cell;
                gridPane.add(cell, x, y);
            }
        }
        updateCursor();
        return gridPane;
    }

    private void moveCursorUp() {
        if (cursorY > 0) {
            cursorY--;
            updateCursor();
        }
    }

    private void moveCursorDown() {
        if (cursorY < GRID_SIZE - 1) {
            cursorY++;
            updateCursor();
        }
    }

    private void moveCursorLeft() {
        if (cursorX > 0) {
            cursorX--;
            updateCursor();
        }
    }

    private void moveCursorRight() {
        if (cursorX < GRID_SIZE - 1) {
            cursorX++;
            updateCursor();
        }
    }

    private void togglePixel() {
        grid[cursorY][cursorX] = !grid[cursorY][cursorX];
        updateCellColor(cursorX, cursorY);
    }

    private void updateCellColor(int x, int y) {
        cells[y][x].setFill(grid[y][x] ? Color.BLACK : Color.WHITE);
    }

    private void updateCursor() {
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                if (x == cursorX && y == cursorY) {
                    cells[y][x].setStroke(Color.RED);
                } else {
                    cells[y][x].setStroke(Color.BLACK);
                }
            }
        }
    }

    private void generateJavaCode() {
        StringBuilder code = new StringBuilder("int[][] pixelArt = {\n");
        for (int y = 0; y < GRID_SIZE; y++) {
            code.append("    {");
            for (int x = 0; x < GRID_SIZE; x++) {
                code.append(grid[y][x] ? "1" : "0");
                if (x < GRID_SIZE - 1) {
                    code.append(", ");
                }
            }
            code.append("}");
            if (y < GRID_SIZE - 1) {
                code.append(",\n");
            }
        }
        code.append("\n};");
        System.out.println(code.toString());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
