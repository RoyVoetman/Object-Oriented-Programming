package nl.hanze.roy.oop.proxy;

import java.util.Scanner;

// the context
public class ATMProxy implements AbstractATM {
    private ATM atm = new ATM();

    @Override
    public ATMState getATMState() {
        return atm.getATMState();
    }

    @Override
    public int getCashInMachine() {
        return atm.getCashInMachine();
    }
}
