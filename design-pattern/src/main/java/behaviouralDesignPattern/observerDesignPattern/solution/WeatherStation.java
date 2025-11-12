package behaviouralDesignPattern.observerDesignPattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class WeatherStation implements Subject {

    private float temperature;

    private final List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature); // Runtime Polymorphism
        }
    }
}
