package javacourse.codingexercises.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {10,20,13,2,45,5};
        System.out.println(Arrays.toString(reverse(array)));
    }
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int length = array.length;
        length--;
        for (int i = 0; i < array.length;i++) {
            reversedArray[i] = array[length];
            length--;
        }
        return reversedArray;
    }
}
