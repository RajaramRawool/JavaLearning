package javacourse.codingexercises.flowcodingexercises;

import javacourse.Constants.CourseConstants;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if ((number > 0) && (number < 10)) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
            return false;
        }else {
            int tempNumber = Math.abs(number);
            int reverseNumber = 0;
            while (tempNumber > 0){
                reverseNumber = reverseNumber * 10 + (tempNumber % 10);
                tempNumber /= 10;
            }
            if (Math.abs(number) == reverseNumber) {
                return true;
            }else {
                return false;
            }
        }
    }
}
