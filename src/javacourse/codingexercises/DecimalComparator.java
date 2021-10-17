package javacourse.codingexercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
       int num1 = (int) (number1 * 1000);
        System.out.println(num1);
       int num2 = (int) (number2 * 1000);
        System.out.println(num2);
       if (num1 == num2) {
           return true;
       }else {
           return false;
       }
    }
}
