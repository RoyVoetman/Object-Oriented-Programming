public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding sauce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + " + tomato sauce";
    }
    
    public double getCost() {
        System.out.println("Cost of sauce: " + .35);
        return tempPizza.getCost() + .35;
    }
}
