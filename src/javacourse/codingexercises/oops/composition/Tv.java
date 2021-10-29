package javacourse.codingexercises.oops.composition;

public class Tv {
    private String model;
    private double size;

    public Tv(String model, double size) {
        this.model = model;
        this.size = size;
    }
    public void tvInfo(){
        System.out.println(getModel() + " " + (int)getSize() + " inch");
    }


    private String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
}
