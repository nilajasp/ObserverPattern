package JavaAPI;

import JavaCode.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by nilajapatankar on 10/9/14.
 */
public class Product extends Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean available;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(available);
        }
    }

    public void setAvailability(boolean availability) {
        available = availability;
        notifyObservers();
    }
}
