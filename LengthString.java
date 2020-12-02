import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
    String fName = "Daniel";
    String lName = "Tlahuextl-Toxqui";
    System.out.print("What is your first name?" );
    fName = keyboard.nextLine();
    System.out.print("What is your last name? ");
    lName = keyboard.nextLine();
    String fullName = fName + " " + lName;

    System.out.println("The length of your first name is " + fName.length() + " characters.");
    System.out.println("the length of your last name is " + lName.length() + " characters.");
    System.out.println("The length of your full name is " + (fullName.length() - 1) + " characters");

    if (fullName.length() <= 10) {
        System.out.println("Wow, your full name is " + (fullName.length() - 1) + " characters. \nThat must of made your name easy to print.");
    } else if (fullName.length() >= 25) {
        System.out.println("Wow, your name is " + (fullName.length() - 1) + "characters. \nThat must take a lot of ink to write.");
    }

    char a = 'a'; // "a"
    String nothing = "";
    String abc = "abc";

    System.out.println("The length of \"" + a + "\" is " + a.length());
    System.out.println("The length of \"" + nothing + "\" is " + nothing.length());
    System.out.println("The length of \"" + abc + "\" is "+ abc.length());
    }
}
   