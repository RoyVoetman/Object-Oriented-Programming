package nl.hanze.roy.oop.week3.iterator;

import java.util.Iterator;

public class StackIterator<E> implements Iterator<E> {
    MyStack<E> stack;

    public StackIterator(MyStack<E> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override
    public E next() {
        return this.stack.pop();
    }
}
