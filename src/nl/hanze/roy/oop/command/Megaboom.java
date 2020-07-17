package nl.hanze.roy.oop.command;

// a comand receiver
public class Megaboom implements Device {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Megaboom turned on");
    }

    @Override
    public void off() {
        System.out.println("Megaboom turn off");
    }

    @Override
    public void volumeUp() {
        volume += 10;
        System.out.println("Volume of Megaboom increased to " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume - 10 >= 0) {
            volume -= 10;
            System.out.println("Volume of Megaboom decreased to " + volume);
        } else {
            System.out.println("Volume of Megaboom already at 0");
        }
    }
}
