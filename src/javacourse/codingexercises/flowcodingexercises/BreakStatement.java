package javacourse.codingexercises.flowcodingexercises;

public class BreakStatement {
    public static void main(String[] args) {
            int count = 0;
        for (int i = 0 ; i < 100; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        System.out.println(count);
        count = 0;
        int sum = 0;
        for (int i = 1 ; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);

    }

    public static boolean isPrimeNumber(int number) {
        if ( number == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
      }

}
