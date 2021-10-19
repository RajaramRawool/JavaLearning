package javacourse.codingexercises.flowcodingexercises;

public class SwitchStatementFlow {
    public static void main(String[] args) {
        char letter = 'f';
        switch (letter) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("found");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
