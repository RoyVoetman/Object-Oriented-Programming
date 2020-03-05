package nl.hanze.roy.oop.week3.command;

// concrete command
public class SpeakerOnOffCommand implements Command {
    
    enum State {ON, OFF};

    Device device;
    State state;

    public SpeakerOnOffCommand (Device device) {
        this.device = device;
        this.device.off();
        this.state = State.OFF;
    }

    @Override
    public void execute() {
        if(state == State.OFF){
            device.on();
            state = State.ON;
        } else {
            device.off();
            state = State.OFF;
        }
    }
}