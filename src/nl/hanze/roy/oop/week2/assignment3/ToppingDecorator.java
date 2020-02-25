package nl.hanze.roy.oop.week2.assignment3;

// Abstract Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
