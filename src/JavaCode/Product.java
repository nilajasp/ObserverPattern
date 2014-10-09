package JavaCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nilajapatankar on 10/6/14.
 */
public class Product implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean available;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
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
