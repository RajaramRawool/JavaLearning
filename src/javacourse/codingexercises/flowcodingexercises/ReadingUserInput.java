package javacourse.codingexercises.flowcodingexercises;

import javacourse.constants.CourseConstants;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.print("Enter Number #" + (count + 1) + ":- ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }else {
                int number = scanner.nextInt();
                System.out.println(CourseConstants.INVALID_VALUE_MESSAGE);
            }
            count++;
        }
        System.out.println("Sum of Entered numbers is :- " + sum);
    }
}
