package nl.hanze.roy.oop.week3.state;

public class OutOfService implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("\tThis ATM is out of service");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("\tThis ATM is out of service");
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("\tThis ATM is out of service");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("\tThis ATM is out of service");
    }
}
