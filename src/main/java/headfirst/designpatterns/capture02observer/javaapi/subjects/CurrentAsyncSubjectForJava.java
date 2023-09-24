package headfirst.designpatterns.capture02observer.javaapi.subjects;

import headfirst.designpatterns.capture02observer.self.interfaces.Observer;
import headfirst.designpatterns.capture02observer.self.interfaces.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @description: ]
 * @author: pxlngu
 * @date: 2023-09-24 11:31
 */
@Data
public class CurrentAsyncSubjectForJava extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.setChanged();
        notifyObservers();
    }
}
