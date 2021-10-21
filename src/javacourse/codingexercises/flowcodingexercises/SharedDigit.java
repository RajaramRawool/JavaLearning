package javacourse.codingexercises.flowcodingexercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        boolean sharedDigit = false;
        int tempNumber1 = number1;
        if(((number1 < 10) || (number1 > 99)) || ((number2 < 10) || (number2 > 99))) {
            System.out.println("invalid");
            return  sharedDigit;
        }else {
            for (; tempNumber1 > 0; tempNumber1 /= 10) {
                int digitNumber1 = tempNumber1 % 10;
                int tempNumber2 = number2;
                for (; tempNumber2 > 0; tempNumber2 /= 10) {
                    int digitNumber2 = tempNumber2 % 10;
                    if (digitNumber1 == digitNumber2) {
                        sharedDigit = true;
                        break;
                    }
                }
            }
            return sharedDigit;
        }
    }
}
