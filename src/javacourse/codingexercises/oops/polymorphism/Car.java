package javacourse.codingexercises.oops.polymorphism;

public class Car {
//    Instance Variables
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine= true;
        this.wheels = 4;
    }

    //  Getters

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    //    Instance methods
    public String startEngine() {
        return getClass().getSimpleName() + " Engine Started....";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " Accelerating...";
    }
    public String brake() {
        return getClass().getSimpleName() +  " Brake.....";
    }
}
