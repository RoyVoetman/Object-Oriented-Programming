package nl.hanze.roy.oop.decorator;

public class PlainPizza implements Pizza {
    private String size = "M";
 
    public String getDescription() {
        return "a plain pizza";
    }

    public double getCost() {
        System.out.println("Cost of plain pizza: " + 4.00);
        return 4.00;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }
}
