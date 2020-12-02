import java.util.Scanner;

public class DoWhileIntro {
    public static void main( String args[] ) {
        Scanner keyboard = new Scanner(System.in);
        char ch;

        do {
            System.out.print( "Press a key followed by ENTER: " );
            ch = keyboard.next().charAt(0);
        } while(ch != 'q');     
    }
}