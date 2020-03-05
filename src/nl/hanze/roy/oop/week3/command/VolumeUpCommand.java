package nl.hanze.roy.oop.week3.command;

// concrete command
public class VolumeUpCommand implements Command {
    
    Device device;

    public VolumeUpCommand (Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}