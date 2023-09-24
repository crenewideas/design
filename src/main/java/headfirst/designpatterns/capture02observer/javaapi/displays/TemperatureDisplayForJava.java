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
public class TemperatureDisplayForJava implements Observer, Display {
    private float temperature;
    private Observable observable;

    public TemperatureDisplayForJava(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current temperature is : " + temperature);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof CurrentAsyncSubjectForJava) {
            CurrentAsyncSubjectForJava currentAsyncSubjectForJava = (CurrentAsyncSubjectForJava) o;
            temperature = currentAsyncSubjectForJava.getTemperature();
            display();
        }
    }
}
