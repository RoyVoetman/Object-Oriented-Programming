package nl.hanze.roy.oop.state;

import java.util.Scanner;

public class HasCorrectPin implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("\tCard already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("\tCard ejected");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("\tPIN already provided and validated");
    }

    @Override
    public void requestAmount(ATM atm) {
        int requestedAmount;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\tEnter amount to withdraw: ");
            requestedAmount = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR");
            atm.setState(new OutOfService());
            return;
        }

        if (atm.withdraw(requestedAmount)) {
            System.out.println("\tSuccessfully requested: " + requestedAmount + " euros");
            atm.setState(new HasAmount());
        } else {
            System.out.println("\tERROR");
            atm.setState(new OutOfService());
        }
    }
}
