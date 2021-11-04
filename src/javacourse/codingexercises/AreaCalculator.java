package javacourse.codingexercises;

import javacourse.constants.CourseConstants;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
            return -1;
        } else {
            return CourseConstants.PI * radius * radius ;
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
            return -1 ;
        } else {
            return x * y;
        }
    }
}

