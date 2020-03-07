package nl.hanze.roy.oop.week3.singleton;

class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance( ) {
        return singleton;
    }
}