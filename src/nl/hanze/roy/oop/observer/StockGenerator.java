package nl.hanze.roy.oop.observer;

import java.util.ArrayList;

public class StockGenerator implements Subject {
    
    private ArrayList<Observer> observers;

    public StockGenerator(){
        this.observers = new ArrayList<>();
    }
    
    public void register(Observer newObserver) {
        this.observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {
        this.observers.remove(deleteObserver);
    }

    public void notifyObservers(String stock, float price) {
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }
}
