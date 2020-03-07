package nl.hanze.roy.oop.week3.state;

public class HasAmount implements ATMState {
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
        System.out.println("\tMoney already withdrew");
    }
}
