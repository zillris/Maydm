import java.util.Scanner;

public class FridayFunDay {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height;

        System.out.print("Hello how tall do you want the pyramid to be?");
        height = keyboard.nextInt();

        for (int count = 1; count <= height; count++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(("*") + " ");
            }
            System.out.println();
        }

    }
}