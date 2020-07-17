package nl.hanze.roy.oop.command;

// a comand receiver
public class Bose implements Device {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Bose turned on");
    }

    @Override
    public void off() {
        System.out.println("Bose turn off");
    }

    @Override
    public void volumeUp() {
        volume += 10;
        System.out.println("Volume of bose increased to " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume - 10 >= 0) {
            volume -= 10;
            System.out.println("Volume of bose decreased to " + volume);
        } else {
            System.out.println("Volume of bose already at 0");
        }
    }
}
