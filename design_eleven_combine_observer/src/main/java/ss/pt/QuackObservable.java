package ss.pt;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
