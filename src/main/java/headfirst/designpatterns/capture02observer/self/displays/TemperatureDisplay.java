package headfirst.designpatterns.capture02observer.self.displays;

import headfirst.designpatterns.capture02observer.self.interfaces.Display;
import headfirst.designpatterns.capture02observer.self.interfaces.Observer;
import headfirst.designpatterns.capture02observer.self.interfaces.Subject;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-24 11:41
 */
public class TemperatureDisplay implements Observer, Display {
    private float temperature;
    private Subject subject;

    public TemperatureDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current temperature is : " + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}
