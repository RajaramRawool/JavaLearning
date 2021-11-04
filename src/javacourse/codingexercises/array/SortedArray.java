package javacourse.codingexercises.array;

import java.util.Scanner;


public class SortedArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(0);
        printArray(intArray);
        sortInteger(intArray);
        printArray(intArray);


    }

    private static int[] sortInteger(int[] array) {
        int temp = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (i == 0) {
                System.out.print("{ " + intArray[i] + ", ");
            } else if (i == (intArray.length - 1)) {
                System.out.print(intArray[i] + " }");
            } else {
                System.out.print(intArray[i] + ", ");
            }

        }
    }

    private static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter your Desired Numbers \r");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
