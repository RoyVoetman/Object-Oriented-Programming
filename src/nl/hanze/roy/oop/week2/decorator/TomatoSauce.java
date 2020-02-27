package nl.hanze.roy.oop.week2.decorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding sauce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + " + tomato sauce";
    }
    
    public double getCost() {
        double cost = 0;

        switch (tempPizza.getSize()) {
            case "S":
                cost = 0.25;
                break;
            case "M":
                cost = 0.35;
                break;
            case "L":
                cost = 0.45;
                break;
        }

        System.out.println("Cost of sauce: " + cost);

        return tempPizza.getCost() + cost;
    }
}
