package nl.hanze.roy.oop.week3.state;

// the context
public class ATM
{
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
}
