package designpattern.observerpattern;

public class CurrentWeatherDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float airPressure;
    Publisher publisher;
    public CurrentWeatherDisplay(Publisher pub) {
        publisher = pub;
        publisher.registerObserver(this);
    }
    @Override
    public void update(float temp, float humid, float airPressure) {
        this.temperature = temp;
        this.humidity = humid;
        this.airPressure = airPressure;
        display();
    }

    public void display() {
        System.out.printf("Current Conditions: %f F degrees and %f humidity%n",
                temperature, humidity);
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
