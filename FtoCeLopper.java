import java.util.Scanner;

public class FtoCeLopper {
    public static void main( String[] args ) {
        float fahrenheit, celsius, fiveNinths = (5F/9F);
        int counter = 0;

        for ( fahrenheit = -40; fahrenheit <= 212; fahrenheit++) {
            celsius = ((fahrenheit - 32) * fiveNinths);
            System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
            counter++;

            if ( counter == 10 ) {
                System.out.println();
                counter = 0;
            }
        }
    }
}