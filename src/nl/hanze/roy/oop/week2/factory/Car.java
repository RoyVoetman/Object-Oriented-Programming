package nl.hanze.roy.oop.week2.factory;

// abstract product
interface Car {
    public int getCost();
    public String getExtras();
}

// the concrete products
class Sedan implements Car {

    @Override
    public int getCost() {
        return 30000;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class StationWagon implements Car {

    @Override
    public int getCost() {
        return 40000;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class PickUp implements Car {

    @Override
    public int getCost() {
        return 50000;
    }

    @Override
    public String getExtras() {
        return null;
    }
}

class SUV implements Car {

    @Override
    public int getCost() {
        return 60000;
    }

    @Override
    public String getExtras() {
        return null;
    }
}