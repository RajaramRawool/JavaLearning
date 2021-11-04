package javacourse.codingexercises.flowcodingexercises;

import javacourse.constants.CourseConstants;

public class SumOddRange {
    public static void main(String[] args) {
        int startingNumber = 4, EndingNumber = 20, count = 0;
        while(startingNumber <= EndingNumber) {
            startingNumber ++;
            if (!isEvenNumber(startingNumber)) {
                continue;
            }
            count++;
            System.out.println("Even Number" + startingNumber);
            if (count == 5) {
                break;
            }
        }
        System.out.println(count);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }else if (number % 2 != 0) {
            return true;
        }else {
            return false;
        }
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return  sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
            return false;
        }else if (number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
