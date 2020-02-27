package nl.hanze.roy.oop.week2.observer;

// concrete Observer that is monitoring changes in the subject
public class Stock implements Observer {

    private int step;

    private String stock;

    public Stock(Subject stockGenerator, String stock) {
        this.stock = stock;

        stockGenerator.register(this);
    }

    public void update(String stock, float price) {
        if(stock.equals(this.stock)) {
            App.updateStock(stock, price, step);

//            DecimalFormat df = new DecimalFormat("###,###.##");
//            System.out.println(stock + " = " + df.format(price));

            step++;
        }
    }
}