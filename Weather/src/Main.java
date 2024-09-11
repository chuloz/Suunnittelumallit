public class Main {
    public static void main(String[] args) {
        // Luo sääasema ja havaitsijoita
        WeatherStation station = new WeatherStation();
        WeatherObserver observer1 = new ConcreteObserver("Havaitsija 1");
        WeatherObserver observer2 = new ConcreteObserver("Havaitsija 2");
        WeatherObserver observer3 = new ConcreteObserver("Havaitsija 3");

        // Lisää havaitsijat sääasemalle
        station.addObserver(observer1);
        station.addObserver(observer2);
        station.addObserver(observer3);

        // Käynnistä sääaseman säie
        station.start();

        // Anna simulaation pyöriä 15 sekuntia
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Poista yksi havaitsija ja jatka simulaatiota
        System.out.println("Havaitsija 2 poistetaan.");
        station.removeObserver(observer2);

        // Anna simulaation pyöriä vielä 10 sekuntia
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lopeta sääasema
        station.stopStation();
    }
}