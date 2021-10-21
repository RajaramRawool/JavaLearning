package javacourse.codingexercises.flowcodingexercises;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }else {
            int number1LastDigit = number1 % 10;
            int number2LastDigit = number2 % 10;
            int number3LastDigit = number3 % 10;
            if ((number1LastDigit == number2LastDigit) || (number1LastDigit == number3LastDigit) ||
                    (number2LastDigit == number3LastDigit)) {
                return true;
            }else {
                return false;
            }
        }
    }
    public static boolean isValid(int number) {
        if ((number < 10) || (number > 1000))  {
            return false;
        }else {
            return true;
        }
    }
}
