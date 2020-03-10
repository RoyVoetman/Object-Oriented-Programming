package nl.hanze.roy.oop.week3.iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class MyStack<E> implements Iterable<E> {

    private ArrayList<E> list = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return new StackIterator<>(list);
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
