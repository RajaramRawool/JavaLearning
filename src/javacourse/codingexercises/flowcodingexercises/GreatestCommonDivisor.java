package javacourse.codingexercises.flowcodingexercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int smallNumber = 0;
        int largeNumber = 0;
        if ((first < 10) || (second < 10)) {
            return -1;
        }else {
            if ((first < second)) {
                smallNumber = first;
                largeNumber = second;
                if (second % first == 0) {
                    return smallNumber;
                }
            }else {
                smallNumber = second;
                largeNumber = first;
                if (first % second == 0) {
                    return smallNumber;
                }
            }
            for (int i = largeNumber; i > 0; i--) {
                int divisor1 = 0;
                if(largeNumber % i == 0) {
                    divisor1 = i;
                }else {
                    continue;
                }
                for (int j = smallNumber; j > 0; j--) {
                    int divisor2 = 0;
                    if (smallNumber % j == 0) {
                        divisor2 = j;
                    }else {
                        continue;
                    }
                    if (divisor1 == divisor2) {
                        return divisor1;
                    }
                }
            }

        }
        return -1;
    }
}
