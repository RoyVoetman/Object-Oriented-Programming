package nl.hanze.roy.oop.week2.assignment2;

// the Client
public class StockApp {
    public static void main(String[] args) {

        // create concrete subject
        StockGrabber stockGrabber = new StockGrabber();

        // create and register concrete observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);
    }
}

