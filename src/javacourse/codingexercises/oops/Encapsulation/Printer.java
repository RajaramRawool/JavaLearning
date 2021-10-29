package javacourse.codingexercises.oops.Encapsulation;

public class Printer {
//    Instance Variables
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

//  Constructor
    public Printer( int tonerLevel, boolean duplex) {
        if ((tonerLevel >= 0) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

//  Getters


    public int getPagesPrinted() {
        return pagesPrinted;
    }


    //    Instance Method
    public int addToner(int tonerAmount){
        if ((tonerAmount > 0) && (tonerAmount <= 100) && ((tonerAmount + tonerLevel) <= 100)) {
            tonerLevel +=  tonerAmount;
            return tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
