package javacourse.codingexercises.oops;

public class Calculator {
//    Instance Variables / fields
    private Floor floor;
    private Carpet carpet;

//    Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

//    Instance Method
    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
