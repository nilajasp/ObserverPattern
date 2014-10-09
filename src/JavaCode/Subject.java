package JavaCode;

/**
 * Created by nilajapatankar on 10/6/14.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
