package nl.hanze.roy.oop.multithreading;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment1 extends Application {
    public static TextArea textArea;

    public static void main(String[] args) {
        launch(args);
    }

    public static synchronized void appendText(String string) {
        Assignment1.textArea.appendText(string);
    }

    @Override
    public void start(Stage primaryStage) {
        Assignment1.textArea = new TextArea();

        // Create tasks
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        VBox vbox = new VBox(textArea);

        Scene scene = new Scene(vbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {
    private char charToPrint; // The character to print
    private int times; // The times to repeat

    /**
     * Construct a task with specified character and number of
     * times to print the character
     */
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    /**
     * Override the run() method to tell the system
     * what the task to perform
     */
    public void run() {
        for (int i = 0; i < times; i++) {
            String string = String.valueOf(charToPrint);

            Assignment1.appendText(string);
        }
    }
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ... i
     */
    public PrintNum(int n) {
        lastNum = n;
    }

    /**
     * Tell the thread how to run
     */
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            Assignment1.appendText(" " + i);
        }
    }
}