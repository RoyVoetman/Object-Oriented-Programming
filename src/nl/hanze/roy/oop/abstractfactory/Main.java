package nl.hanze.roy.oop.abstractfactory;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        CarDealer opelDealer = new CarDealer(new OpelCarFactory());
        CarDealer renoDealer = new CarDealer(new RenoCarFactory());

        System.out.println("Open Sedan costs: " + opelDealer.getCostSedan());
        System.out.println("Reno Sedan costs: " + renoDealer.getCostSedan());
    }
}
