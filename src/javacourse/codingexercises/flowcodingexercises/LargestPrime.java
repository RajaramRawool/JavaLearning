package javacourse.codingexercises.flowcodingexercises;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        boolean isPrime;
        int largestPrimeNumber = 0;
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime){
                    largestPrimeNumber = i;
                }
            }
        }
        return largestPrimeNumber;
    }
}
