package headfirst.designpatterns.capture02observer.self.displays;

import headfirst.designpatterns.capture02observer.self.interfaces.Display;
import headfirst.designpatterns.capture02observer.self.interfaces.Observer;
import headfirst.designpatterns.capture02observer.self.interfaces.Subject;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-24 11:41
 */
public class PressureDisplay implements Observer, Display {
    private float pressure;
    private Subject subject;

    public PressureDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current pressure is : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
