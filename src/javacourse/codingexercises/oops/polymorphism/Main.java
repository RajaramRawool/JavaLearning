package javacourse.codingexercises.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2,"Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Car holden= new Holden(2, "holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }

}
