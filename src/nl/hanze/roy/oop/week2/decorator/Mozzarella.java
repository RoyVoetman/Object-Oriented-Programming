package nl.hanze.roy.oop.week2.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mozzarella");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + " + mozzarella";
    }
    
    public double getCost() {
        double cost = 0;

        switch (tempPizza.getSize()) {
            case "S":
                cost = 0.30;
                break;
            case "M":
                cost = 0.50;
                break;
            case "L":
                cost = 0.80;
                break;
        }

        System.out.println("Cost of mozzarella: " + cost);

        return tempPizza.getCost() + cost;
    }
}
