package nl.hanze.roy.oop.proxy;

public class Main {
    public static void main(String[] args) {
        AbstractATM atm = new ATMProxy();

        System.out.println("ATM State: " + atm.getATMState());
        System.out.println("Amount of money in ATM: " + atm.getCashInMachine());
    }
}
