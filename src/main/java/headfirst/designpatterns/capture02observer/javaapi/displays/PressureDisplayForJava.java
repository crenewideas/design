package headfirst.designpatterns.capture02observer.javaapi.displays;

import headfirst.designpatterns.capture02observer.javaapi.subjects.CurrentAsyncSubjectForJava;
import headfirst.designpatterns.capture02observer.self.interfaces.Display;
import java.util.Observable;
import java.util.Observer;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-24 11:41
 */
public class PressureDisplayForJava implements Observer, Display {
    private float pressure;
    private Observable observable;

    public PressureDisplayForJava(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current temperature is : " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CurrentAsyncSubjectForJava) {
            CurrentAsyncSubjectForJava currentAsyncSubjectForJava = (CurrentAsyncSubjectForJava) o;
            pressure = currentAsyncSubjectForJava.getTemperature();
            display();
        }
    }
}

