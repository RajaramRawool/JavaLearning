package javacourse.codingexercises.flowcodingexercises;

public class Interest {
    public static void calculateInterest(double amount) {
        for (int i = 2; i < 9 ; i++) {
            double interest = amount * (i/100.0);
            System.out.println(i + "% on " + amount + " = " + String.format("%.2f",interest));
        }
        for (int i = 8; i > 1 ; i--) {
            double interest = amount * (i/100.0);
            System.out.println(i + "% on " + amount + " = " + String.format("%.2f",interest));
        }
    }
}
