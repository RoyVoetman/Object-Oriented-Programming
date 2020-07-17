package nl.hanze.roy.oop.state;

public class HasCard implements ATMState {
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
        if (atm.validatePin()) {
            System.out.println("\tPIN was correct");
            atm.setState(new HasCorrectPin());
        } else {
            System.out.println("\tPIN was incorrect, try again");
        }
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("\tFirst enter your PIN");
    }
}
