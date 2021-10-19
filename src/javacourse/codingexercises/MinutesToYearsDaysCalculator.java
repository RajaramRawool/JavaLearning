package javacourse.codingexercises;

import javacourse.Constants.CourseConstants;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
        } else {
            long year = minutes / 5_25_600;
            long days = (minutes % 5_25_600)/1_440;
            System.out.println(minutes + "min = " + year + " y " + days + " d " );
        }
    }
}
