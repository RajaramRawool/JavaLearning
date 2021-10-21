package javacourse.codingexercises.flowcodingexercises;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(14256));
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        if ((number < 10) ) {
            return -1;
        }else {
            int tempNumber = number;
            while (tempNumber > 0) {
                int remainder = tempNumber % 10;
                sum += remainder;
                tempNumber /= 10;
            }
            return sum;
        }
    }
}
