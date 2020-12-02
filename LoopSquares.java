import java.util.Scanner;

public class LoopSquares {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count;

        System.out.println( "Let's print the squares.");
        for (count = 1; count <= 12; count++) {
            System.out.println( "The square of " + count + " is " + (count * count));
        }
    }
}