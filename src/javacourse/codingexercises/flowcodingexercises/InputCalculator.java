package javacourse.codingexercises.flowcodingexercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputThenPrintSumAndAverage();
        scanner.close();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        double count = 1.0d;
        while (true) {
            System.out.println("Enter number : ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                average = (Math.round(sum / count));
                count++;
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + (int)average);
    }
}

