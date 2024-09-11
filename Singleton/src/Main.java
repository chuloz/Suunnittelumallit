public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("new_log.txt"); // Vaihda tiedoston nimi
        System.out.println("Tiedoston nimi vaihdettu.");

        logger.write("Simulation started");
        System.out.println("Lokiviesti: Simulation started");

        logger.write("Processing data...");
        System.out.println("Lokiviesti: Processing data...");

        logger.write("Simulation finished");
        System.out.println("Lokiviesti: Simulation finished");

        logger.close(); // Muista sulkea logger
        System.out.println("Logger suljettu.");
    }
}
