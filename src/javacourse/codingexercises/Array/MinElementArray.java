package javacourse.codingexercises.Array;

import java.util.Scanner;

public class MinElementArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Count :- ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println(findMin(array));

    }

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;

    }

    public static int findMin(int[] intArray) {
        int temp = 0;
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1] ) {
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i+ 1] = temp;
                }
            }
        }

        return intArray[0];
    }
}
