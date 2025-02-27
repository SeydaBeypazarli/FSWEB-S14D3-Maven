package org.example.company;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "the car's engine is starting";
    }

    public String accelerate() {
        return "the car is accelerating";
    }

    public String brake() {
        return "the car is braking";
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {name='" + name + "', cylinders=" + cylinders + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name != null && name.equals(car.name);
    }
}