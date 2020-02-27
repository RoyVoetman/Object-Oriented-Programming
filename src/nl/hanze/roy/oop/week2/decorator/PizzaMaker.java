package nl.hanze.roy.oop.week2.decorator;

public class PizzaMaker {
    public static void main(String[] args){
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        basicPizza.setSize("L");

        System.out.println("Size: " + basicPizza.getSize());
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}

