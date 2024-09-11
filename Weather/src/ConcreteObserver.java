public class ConcreteObserver implements WeatherObserver {
    private String observerName;

    public ConcreteObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(observerName + ": Sääaseman uusi lämpötila on " + temperature + "°C");
    }
}