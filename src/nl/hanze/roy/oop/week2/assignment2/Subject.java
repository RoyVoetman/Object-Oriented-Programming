package nl.hanze.roy.oop.week2.assignment2;

public interface Subject {
   
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}

