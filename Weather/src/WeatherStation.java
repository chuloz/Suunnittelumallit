import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread {
    private List<WeatherObserver> observers;
    private int temperature;
    private boolean running;

    public WeatherStation() {
        observers = new ArrayList<>();
        Random rand = new Random();
        temperature = rand.nextInt(31) - 10; // Alustetaan satunnainen lämpötila -10 ja +20 välillä
        running = true;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    private void updateTemperature() {
        Random rand = new Random();
        int tempChange = rand.nextInt(3) - 1; // Muutetaan lämpötilaa välillä -1 ja +1
        temperature += tempChange;

        // Asetetaan minimi- ja maksimilämpötilat
        if (temperature < -10) {
            temperature = -10;
        } else if (temperature > 40) {
            temperature = 40;
        }

        notifyObservers();
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (running) {
            try {
                Thread.sleep((rand.nextInt(5) + 1) * 1000); // Odottaa 1-5 sekuntia
                updateTemperature();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopStation() {
        running = false;
    }
}
