package nl.hanze.roy.oop.proxy;

import java.util.Scanner;

// the context
public class ATM implements AbstractATM {
    private ATMState state;
    private int amount = 100;

    // define an initial state
    public ATM() {
        setState(new IdleState());
    }

    void setState(ATMState state) {
        this.state = state;
    }

    ATMState getState() {
        return this.state;
    }

    void insertCard() {
        state.insertCard(this);
    }

    void ejectCard() {
        state.ejectCard(this);
    }

    void insertPin() {
        state.insertPin(this);
    }

    void requestAmount() {
        state.requestAmount(this);
    }

    boolean validatePin() {
        Scanner reader = new Scanner(System.in);
        System.out.print("\tEnter your PIN code: ");
        int pin = reader.nextInt();

        return (pin == 1234);
    }

    boolean withdraw(int amount) {
        if(amount <= this.amount) {
            this.amount -= amount;
            return true;
        }

        return false;
    }

    @Override
    public ATMState getATMState() {
        return state;
    }

    @Override
    public int getCashInMachine() {
        return amount;
    }
}
