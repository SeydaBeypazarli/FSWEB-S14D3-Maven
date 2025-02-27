package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Constructor
    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setter metodları
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void drive() {
        System.out.println("Driving...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running engine...");
    }
}
