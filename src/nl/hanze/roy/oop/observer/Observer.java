package nl.hanze.roy.oop.observer;

public interface Observer {

    // update method is called when the Subject changes
    public void update(String stock, float price);
}
