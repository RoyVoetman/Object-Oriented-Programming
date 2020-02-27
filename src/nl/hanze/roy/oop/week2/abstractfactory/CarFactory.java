package nl.hanze.roy.oop.week2.abstractfactory;

// abstract factory
interface CarFactory {
    Car makeSedan();
    Car makeStationWagon();
    Car makePickUp();
    Car makeSUV();
}

// concrete factories
class OpelCarFactory implements CarFactory {

    @Override
    public Car makeSedan() {
        return new OpelSedan();
    }

    @Override
    public Car makeStationWagon() {
        return new OpelStationWagon();
    }

    @Override
    public Car makePickUp() {
        return new OpelPickUp();
    }

    @Override
    public Car makeSUV() {
        return new OpelSUV();
    }
}

class RenoCarFactory implements CarFactory {

    @Override
    public Car makeSedan() {
        return new RenoSedan();
    }

    @Override
    public Car makeStationWagon() {
        return new RenoStationWagon();
    }

    @Override
    public Car makePickUp() {
        return new RenoPickUp();
    }

    @Override
    public Car makeSUV() {
        return new RenoSUV();
    }
}
