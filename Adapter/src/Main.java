public class Main {
    public static void main(String[] args) {
        // Luodaan CalendarToNewDateAdapter-instanssi
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        // Asetetaan päivämäärä
        dateAdapter.setDay(7);
        dateAdapter.setMonth(11);
        dateAdapter.setYear(2024);

        System.out.println("Alkuperäinen päivämäärä: " + dateAdapter);

        // Siirretään päivämäärää eteenpäin
        dateAdapter.advanceDays(5);
        System.out.println("Päivämäärä 5 päivän kuluttua: " + dateAdapter);

        // Siirretään päivämäärää 30 päivää eteenpäin
        dateAdapter.advanceDays(30);
        System.out.println("Päivämäärä 30 päivän kuluttua: " + dateAdapter);
    }
}
