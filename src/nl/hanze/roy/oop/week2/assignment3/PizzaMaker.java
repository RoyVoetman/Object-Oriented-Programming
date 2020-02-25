package nl.hanze.roy.oop.week2.assignment3;

// the Client
public class PizzaMaker {
    public static void main(String[] args){
        // create a basic pizza with mozzarella & tomatosauce
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}

