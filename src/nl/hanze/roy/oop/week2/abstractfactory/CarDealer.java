package nl.hanze.roy.oop.week2.abstractfactory;

public class CarDealer {
    private CarFactory carFactory;

    CarDealer(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public double getCostSedan() {
        return carFactory.makeSedan().getCost();
    }

    public double getCostStationWagon() {
        return carFactory.makeStationWagon().getCost();
    }

    public double getCostPickUp() {
        return carFactory.makePickUp().getCost();
    }

    public double getCostSUV() {
        return carFactory.makeSUV().getCost();
    }
}
