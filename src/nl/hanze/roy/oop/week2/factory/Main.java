package nl.hanze.roy.oop.week2.factory;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        CarFactory factory = null;

        for (int i=0; i<20; i++){
            java.util.Random rand = new java.util.Random();
            int r1 = rand.nextInt(4) + 1;

            switch (r1) {
                case 1:
                    factory = new SedanFactory();
                    break;
                case 2:
                    factory = new StationWagonFactory();
                    break;
                case 3:
                    factory = new PickUpFactory();
                    break;
                case 4:
                    factory = new SUVFactory();
                    break;
            }

            Car car = factory.makeCar();
            System.out.println("Type of car is " + car + " with price " + car.getCost());
        }
    }
}
