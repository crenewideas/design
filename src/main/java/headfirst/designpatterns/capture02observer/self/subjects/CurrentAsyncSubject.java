package headfirst.designpatterns.capture02observer.self.subjects;

import headfirst.designpatterns.capture02observer.self.interfaces.Observer;
import headfirst.designpatterns.capture02observer.self.interfaces.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ]
 * @author: pxlngu
 * @date: 2023-09-24 11:31
 */
@Data
public class CurrentAsyncSubject implements Subject {
    private final List<Observer> allObserver = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        allObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        allObserver.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : allObserver) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObserver();
    }
}
