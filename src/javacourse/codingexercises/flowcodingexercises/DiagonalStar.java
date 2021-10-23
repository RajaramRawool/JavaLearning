package javacourse.codingexercises.flowcodingexercises;

public class DiagonalStar {
        public static void printSquareStar(int number) {
            if (number < 5) {
                System.out.println("Invalid Value");
                // return;
                // }
            } else { // added this so the above return isn't needed

                // int row = 1;
                // int col = 1;

                // while (row <= number) {
                for (int row = 1; row <= number; row++) {
                    // int col = 1;
                    // while (col <= number) {
                    for (int col = 1; col <= number; col++) {
                        if (col == 1 || col == number || row == 1 || row == number || row == col || col == (number - row + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        // col++;
                    }
                    // row++;
                    System.out.println("");
                }
            } // added this to close the else code block
        }
}

