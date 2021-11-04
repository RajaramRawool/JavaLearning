package javacourse.codingexercises.flowcodingexercises;

import javacourse.constants.CourseConstants;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
        }else {
            int count = getDigitCount(number);
            number = reverse(number);
            for (int i = 0; i < count; i++) {
                switch (number % 10) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                number /= 10;
            }

        }
    }
    public static int reverse(int number) {
        int reverseNumber = 0;
        boolean isNegativeNumber  = (number < 0);
        number = Math.abs(number);
        while(number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        if (isNegativeNumber) {
            return reverseNumber * -1 ;
        }else {
            return reverseNumber;
        }
    }
    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }else if (number < 0) {
            return -1;
        }

        int count = 0;
        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
