package nl.hanze.roy.oop.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Assignment4 {
    public static Integer sum = 0;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1000);

        Task task = new Task();
        for (int i = 0; i < 10000; i++) {
            executor.execute(task);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("sum = " + sum);
    }

    private static class Task implements Runnable {
        @Override
        public synchronized void run() {
            sum++;
        }
    }
}