package Experiment7;

abstract class Solid {
    public abstract double calculateVolume();
}

class Cuboid extends Solid {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }
}

class Sphere extends Solid {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class SolidDemo {
    public static void main(String[] args) {
        Solid cuboid = new Cuboid(5, 10, 15);
        Solid sphere = new Sphere(7);

        System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
    }
}