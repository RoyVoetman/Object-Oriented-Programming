package nl.hanze.roy.oop.command;

// invoker
public class ConcreteButton implements Button {
    Command command;

    @Override
    public void setCommand(Command cmd) {
        command = cmd;
    }

    @Override
    public void pressButton() {
        command.execute();
    }
}
