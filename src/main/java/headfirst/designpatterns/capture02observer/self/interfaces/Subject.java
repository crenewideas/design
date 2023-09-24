package headfirst.designpatterns.capture02observer.self.interfaces;


/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-24 11:22
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
