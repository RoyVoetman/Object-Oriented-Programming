package nl.hanze.roy.oop.proxy;

public interface ATMState {

    void insertCard(ATM atm);

    void ejectCard(ATM atm);

    void insertPin(ATM atm);

    void requestAmount(ATM atm);
}

