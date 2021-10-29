package javacourse.codingexercises.oops.composition;

public class Room {
//    Instance Variables
    private Windows windows;
    private Dimensions dimensions;
    private Sofa sofa;
    private Tv tv;
//    Constructor
    public Room(Windows windows, Dimensions dimensions, Sofa sofa, Tv tv) {
        this.windows = windows;
        this.dimensions = dimensions;
        this.sofa = sofa;
        this.tv = tv;
    }
//    Getters

    public Windows getWindows() {
        return windows;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public Sofa getSofa() {
        return sofa;
    }
    public Tv getTv() {
        return tv;
    }

}
