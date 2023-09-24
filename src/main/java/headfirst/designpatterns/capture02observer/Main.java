package headfirst.designpatterns.capture02observer;

import headfirst.designpatterns.capture02observer.javaapi.displays.PressureDisplayForJava;
import headfirst.designpatterns.capture02observer.javaapi.displays.TemperatureDisplayForJava;
import headfirst.designpatterns.capture02observer.javaapi.subjects.CurrentAsyncSubjectForJava;
import headfirst.designpatterns.capture02observer.self.displays.PressureDisplay;
import headfirst.designpatterns.capture02observer.self.displays.TemperatureDisplay;
import headfirst.designpatterns.capture02observer.self.subjects.CurrentAsyncSubject;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-24 11:44
 */
public class Main {
    public static void main(String[] args) {
        commonJavaObserver();
    }


    public static void commonSelfObserver(){
        CurrentAsyncSubject currentAsyncSubject = new CurrentAsyncSubject();
        new TemperatureDisplay(currentAsyncSubject);
        new PressureDisplay(currentAsyncSubject);
        currentAsyncSubject.setMeasurement(22,22,22);
        currentAsyncSubject.setMeasurement(23,23,23);
    }

    public static void commonJavaObserver(){
        CurrentAsyncSubjectForJava currentAsyncSubject = new CurrentAsyncSubjectForJava();
        new TemperatureDisplayForJava(currentAsyncSubject);
        new PressureDisplayForJava(currentAsyncSubject);
        currentAsyncSubject.setMeasurement(22,22,22);
        currentAsyncSubject.setMeasurement(23,23,23);
    }


}
