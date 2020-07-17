package nl.hanze.roy.oop.observer;

public class UpdateStock implements Runnable {
    private String stock;
    private float price;
    private final StockGenerator stockGenerator;
    
    public UpdateStock(StockGenerator stockGenerator, String stock, float price) {
        this.stockGenerator = stockGenerator;
        this.stock = stock;
        this.price = price;
    }
    
    public synchronized void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
            // generate a random number between -3 and +3
            float randNum = (float)(6*Math.random() - 3);
            price = price + randNum;

            stockGenerator.notifyObservers(stock, price);
        }
    }
}
