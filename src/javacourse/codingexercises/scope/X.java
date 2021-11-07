package javacourse.codingexercises.scope;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        X x = new X();
        x.x();
        X.xX xx = x.new xX();
        System.out.println("+++++++++++++++++++++++++++");
        xx.x();

    }
    public static Scanner scanner = new Scanner(System.in);
    private int x = 0;

    public X() {
        System.out.print("Enter Number :- ")
        ;
        this.x = scanner.nextInt();
    }

    public void x() {
        for (int x = 0 ; x <= 12 ; x++) {
            System.out.println(this.x + " times " + x + " = " + (this.x * x));
        }
    }

    public class xX {
        public void x() {
            for (int x = 0 ; x <= 10 ; x++) {
                System.out.println(X.this.x + " times " + x + " = " + (X.this.x * x) );
            }

        }
    }

}
