package GS09_DesignPatterns.BehavioralDP.ObserverDP.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

