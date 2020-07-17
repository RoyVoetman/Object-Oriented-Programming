package nl.hanze.roy.oop.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        System.out.println("Iterator: ");
        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        Iterator<String> it = stack.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nFor loop: ");

        for(String string : stack) {
            System.out.println(string);
        }

    }
}
