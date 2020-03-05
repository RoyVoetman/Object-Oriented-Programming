package nl.hanze.roy.oop.week3.command;

// concrete command
public class VolumeDownCommand implements Command {

    Device device;

    VolumeDownCommand (Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}