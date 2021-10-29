package javacourse.codingexercises.oops.composition;

public class Dimensions {
//    Instance Variables
    private int width;
    private int breadth;
    private int height;
//    Constructor

    public Dimensions(int width,int breadth, int height) {
        this.width = width;
        this.breadth = breadth;
        this.height = height;
    }
//    Getters
    public int getWidth() {
        return width;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}
