package nl.hanze.roy.oop.week2.assignment3;

// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost() {
        System.out.println("Cost of mozzarella: " + .50);
        return tempPizza.getCost() + .50;
    }
}
