package designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {

    private float temp;
    private float humid;
    private float airPressure;
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer ob) {
        observerList.add(ob);
    }
    @Override
    public void removeObserver(Observer ob) {
        observerList.remove(ob);
    }
    @Override
    public void notifyObserver() {
        observerList.forEach(observer -> observer.update(temp, humid, airPressure));
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurments(float temp, float humid, float airPressure) {
        this.temp = temp;
        this.humid = humid;
        this.airPressure = airPressure;
        measurementChanged();
    }
}
