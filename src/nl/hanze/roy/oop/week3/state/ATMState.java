package nl.hanze.roy.oop.week3.state;

public interface ATMState {

    void insertCard(ATM atm);

    void ejectCard(ATM atm);

    void insertPin(ATM atm);

    void requestAmount(ATM atm);

}

// implement the 5 concrete states

