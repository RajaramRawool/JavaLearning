package javacourse.codingexercises.flowcodingexercises;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        int smallestNumber = 0;
        int largestNumber = 0;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean first = true;
        int min = 0;
        int max = 0;
        while (count < 3) {
            System.out.println("Enter Number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }else if (number > max) {
                    max = number;
                }
            }else {
                break;
            }
        }
        System.out.println("Min " + min + " Max " + max);
        scanner.close();
    }

}
