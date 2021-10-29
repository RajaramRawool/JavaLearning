package javacourse.codingexercises.oops.composition;

public class Sofa {
//    instance Variables
    private String model;
    private int numberOfSofas;
//    Constructor
    public Sofa(String model, int numberOfSofas) {
        this.model =model;
        this.numberOfSofas = numberOfSofas;
    }
//    Getters
    public String getModel() {
        return model;
    }
    public int getNumberOfSofas() {
        return numberOfSofas;
    }
}
