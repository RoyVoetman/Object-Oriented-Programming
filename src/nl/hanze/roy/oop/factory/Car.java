package nl.hanze.roy.oop.factory;

// abstract product
interface Car {
    public int getCost();
}

// the concrete products
class Sedan implements Car {

    @Override
    public int getCost() {
        return 30000;
    }
}

class StationWagon implements Car {

    @Override
    public int getCost() {
        return 40000;
    }
}

class PickUp implements Car {

    @Override
    public int getCost() {
        return 50000;
    }
}

class SUV implements Car {

    @Override
    public int getCost() {
        return 60000;
    }
}
