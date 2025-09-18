abstract class Vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

class Car extends Vehicle {
    void startEngine() { System.out.println("Car engine started."); }
}

class Bike extends Vehicle {
    void startEngine() { System.out.println("Bike engine started."); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}
