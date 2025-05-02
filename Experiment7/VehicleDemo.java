package Experiment7;

interface Vehicle {
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle {
    private double fuelLevel = 50.0; 

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}

class Motorcycle implements Vehicle {
    private double fuelLevel = 20.0; 

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        System.out.println("Car fuel level: " + car.getFuelLevel());
        car.stop();

        motorcycle.start();
        System.out.println("Motorcycle fuel level: " + motorcycle.getFuelLevel());
        motorcycle.stop();
    }
}