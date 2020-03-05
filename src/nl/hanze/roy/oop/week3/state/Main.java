package nl.hanze.roy.oop.week3.state;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the context
        ATM atm = new ATM();
        atm.setState(new IdleState());

        System.out.println("Type a number for an event:");
        System.out.println("1. Insert card");
        System.out.println("2. Enter PIN code");
        System.out.println("3. Enter amount");
        System.out.println("4. I want my money honey");
        System.out.println();

        System.out.println("Insert your card");

        // while loop

    }
}