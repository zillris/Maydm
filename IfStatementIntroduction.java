import java.util.Scanner; 
    public class IfStatementIntroduction {
        public static void main( String[] args ) {
    
        Scanner keyboard = new Scanner(System.in);
        boolean Boo1A, Boo1B;
        double x, y;

        System.out.print( "Enter the first number: " );
        x = keyboard.nextDouble();
        System.out.print( "Enter the second number: " );
        y = keyboard.nextDouble();

        if (x == y) {
            System.out.println( x + " and " + y + " are equal." );
        } else if (x > y) {
            System.out.println( x + " is greater than " + y );
        } else {
            System.out.println( x + " is less than " + y );
        }
    }
}