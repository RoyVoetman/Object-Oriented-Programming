package nl.hanze.roy.oop.week3.state;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the context
        ATM atm = new ATM();
        atm.setState(new IdleState());

        System.out.println("MENU:");
        System.out.println("1. Insert card");
        System.out.println("2. Enter PIN code");
        System.out.println("3. Request amount");
        System.out.println("4. Eject card");
        System.out.println();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a number: ");

            switch (reader.nextInt()) {
                case 1:
                    atm.insertCard();
                    break;
                case 2:
                    atm.insertPin();
                    break;
                case 3:
                    atm.requestAmount();
                    break;
                case 4:
                    atm.ejectCard();
                    break;
                default:
                    System.out.println("Wrong number choose 1, 2, 3 or 4");
            }
        }

    }
}