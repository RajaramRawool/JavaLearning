package javacourse.codingexercises;

public class MethodOverloadingExercise {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeter ;
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double inch = feet * 12 ;
            System.out.println(inch);
            inch += inches;
            System.out.println(inch);
            centimeter = inch * 2.54 ;
            return centimeter;
        }else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)inches / 12;
            double inch = (int)inches % 12 ;
            return calcFeetAndInchesToCentimeters(feet ,inch) ;
        }else {
            return -1;
        }
    }
}

