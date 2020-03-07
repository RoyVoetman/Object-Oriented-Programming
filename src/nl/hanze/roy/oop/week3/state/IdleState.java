package nl.hanze.roy.oop.week3.state;

public class IdleState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("\tCard is inserted");
        atm.setState(new HasCard());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("\tFirst insert your card");
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("\tFirst insert your card");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("\tFirst insert your card");
    }
}
