package designpattern.observerpattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData publisher = new WeatherData();

        Observer obs1 = new CurrentWeatherDisplay(publisher);
        Observer obs2 = new ForecastDisplay(publisher);

        publisher.setMeasurments(80, 65, 30.4f);
        publisher.setMeasurments(82, 70, 29.2f);
        publisher.setMeasurments(78, 90, 29.2f);
    }
}
