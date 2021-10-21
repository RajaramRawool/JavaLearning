package javacourse.codingexercises.flowcodingexercises;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }else {
            int lastDigit = number % 10 ;
            int firstDigit = 0;
            for (;number > 0; number/=10) {
                firstDigit = number % 10;
            }
            return firstDigit + lastDigit;
        }
    }
}
