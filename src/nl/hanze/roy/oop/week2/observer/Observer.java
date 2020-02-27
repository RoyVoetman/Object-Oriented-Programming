package nl.hanze.roy.oop.week2.observer;

public interface Observer {

    // update method is called when the Subject changes
    public void update(String stock, float price);
}
