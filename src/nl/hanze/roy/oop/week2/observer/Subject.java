package nl.hanze.roy.oop.week2.observer;

// adding, deleting and updating all observers
public interface Subject {
    
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers(String stock, float price);
}
