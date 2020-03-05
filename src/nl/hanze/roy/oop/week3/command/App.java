package nl.hanze.roy.oop.week3.command;

import java.util.InputMismatchException;
import java.util.Scanner;

// the client
public class App {
    
    public static void main(String[] args) {

        Device reciever;
        Scanner sc;
        char keuze;

        while (true) {

            System.out.println("Kies 'm' (Megaboom) of 'b' (Bose):");

            sc = new Scanner(System.in);
            keuze = sc.next().charAt(0);
        
            // create command receiver
            if (keuze == 'm') {
                reciever = new Megaboom();
            } else {
                reciever = new Bose();
            }
        
            // create three commands and pass them a receiver
            Command onOff = new SpeakerOnOffCommand(reciever);
            Command volumeUp = new VolumeUpCommand(reciever);
            Command volumeDown = new VolumeDownCommand(reciever);

            // create three invokers
            Button b_OnOff = new ConcreteButton();
            Button b_Up = new ConcreteButton();
            Button b_Down = new ConcreteButton();

            b_OnOff.setCommand(onOff);
            b_Up.setCommand(volumeUp);
            b_Down.setCommand(volumeDown);

            while (true) {
                System.out.println("Kies 'o', 'u', 'd' voor on/off, volume up, volume down:");

                try {
                    sc = new Scanner(System.in);
                    keuze = sc.next().charAt(0);

                    switch (keuze) {
                        // invoke command = pass command to invoker
                        case 'o': b_OnOff.pressButton(); break;
                        case 'u': b_Up.pressButton(); break;
                        case 'd': b_Down.pressButton(); break;
                        default: throw new InputMismatchException();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Onjuiste letter gekozen");
                }
            }
        }
    }
}