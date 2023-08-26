package designpattern.observerpattern;

public class ForecastDisplay implements Observer {
    private float temp;
    private float humid;
    private float airPressure;
    private Publisher publisher;
    public ForecastDisplay(Publisher pub) {
        publisher = pub;
        publisher.registerObserver(this);
    }

    @Override
    public void update(float temp, float humid, float airPressure) {
        this.temp = temp;
        this.humid = humid;
        this.airPressure = airPressure;
        display();
    }

    private void display() {
        System.out.printf("Forecast: more of the same as %f degrees tem and %f humid%n", temp, humid);
    }
}
