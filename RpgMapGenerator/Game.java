public class Game {

    public static void main(String[] args) {
        Game game = new Game();

        Map cityMap = game.createMap("city", 5, 5);
        System.out.println("City Map:");
        cityMap.display();

        Map wildernessMap = game.createMap("wilderness", 5, 5);
        System.out.println("Wilderness Map:");
        wildernessMap.display();
    }

    public Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}