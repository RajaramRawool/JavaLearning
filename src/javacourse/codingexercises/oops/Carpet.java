package javacourse.codingexercises.oops;

public class Carpet {
//    Instance Variable / field
    private double cost;

//    constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        }else {
            this.cost = cost;
        }
    }

//    Instance Method
    public double getCost() {
        return this.cost;
    }
}

