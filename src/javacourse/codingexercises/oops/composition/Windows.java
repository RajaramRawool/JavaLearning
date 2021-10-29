package javacourse.codingexercises.oops.composition;

public class Windows {
    private int numberOfWindows;
    private String materialOfWindows;

    public Windows(int numberOfWindows, String materialOfWindows) {
        this.numberOfWindows = numberOfWindows;
        this.materialOfWindows = materialOfWindows;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getMaterialOfWindows() {
        return materialOfWindows;
    }
}
