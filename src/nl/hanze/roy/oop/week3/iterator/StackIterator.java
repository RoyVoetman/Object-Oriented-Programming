package nl.hanze.roy.oop.week3.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StackIterator<E> implements Iterator<E> {
    ArrayList<E> list;
    private int index = 0;

    public StackIterator(ArrayList<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}
