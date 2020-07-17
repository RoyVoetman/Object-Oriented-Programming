package nl.hanze.roy.oop.abstractfactory;

// abstract product
interface Car {
    public int getCost();
    public String getBrand();
}

// the concrete products
class OpelSedan implements Car {

    @Override
    public int getCost() {
        return 30000;
    }

    @Override
    public String getBrand() {
        return "Opel";
    }
}

class OpelStationWagon implements Car {

    @Override
    public int getCost() {
        return 40000;
    }

    @Override
    public String getBrand() {
        return "Opel";
    }
}

class OpelPickUp implements Car {

    @Override
    public int getCost() {
        return 50000;
    }

    @Override
    public String getBrand() {
        return "Opel";
    }
}

class OpelSUV implements Car {

    @Override
    public int getCost() {
        return 60000;
    }

    @Override
    public String getBrand() {
        return "Opel";
    }
}

class RenoSedan implements Car {

    @Override
    public int getCost() {
        return 50000;
    }

    @Override
    public String getBrand() {
        return "Reno";
    }
}

class RenoStationWagon implements Car {

    @Override
    public int getCost() {
        return 40000;
    }

    @Override
    public String getBrand() {
        return "Reno";
    }
}

class RenoPickUp implements Car {

    @Override
    public int getCost() {
        return 50000;
    }

    @Override
    public String getBrand() {
        return "Reno";
    }
}

class RenoSUV implements Car {

    @Override
    public int getCost() {
        return 60000;
    }

    @Override
    public String getBrand() {
        return "Reno";
    }
}
