import java.util.Scanner;

public class CalculatorMethods {
    public static void main (String[] args) {
        int number1;
        String answer;
        int result;
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to Multiply, Divide, Subtract, Add, or do you want to see a remainder? \n Use the first letter of what you want to use.");
        answer = keyboard.next();

        System.out.println("Please put a number you want to " + answer );
        number = keyboard.nextInt();

        System.out.println("Please put the other number. ");
        number1 = keyboard.nextInt();

        if (answer.equals("M")||answer.equals("m")) {
          System.out.println("Your answer is!...... " + Multiplcation(number, number1) + " \n Maydm Rocks!");  
        } else if (answer.equals("D")||answer.equals("d")) {
            System.out.println("Your answer is!...... " + Division(number, number1) + " \n Maydm Rocks!");
        }else if (answer.equals("S")||answer.equals("s")) {
            System.out.println("Your answer is!...... " + Subtract(number, number1) + " \n Maydm Rocks!");
        }else if (answer.equals("A")||answer.equals("a")) {
            System.out.println("Your answer is!...... " + Add(number, number1) + " \n Maydm Rocks!");
        }else if (answer.equals("R")||answer.equals("r")) {
            System.out.println("Your remainder is!......" + Remainder(number, number1) +  "\n Maydm Rocks1");
        }

    }

    public static int Multiplcation(int A, int B) {
        return(A * B);
    }

    public static int Division(int A, int B) {
        return(A / B);
    }

    public static int Subtract(int A, int B) {
        return(A - B);
    }

    public static int Add  (int A, int B) {
        return(A + B);
    }

    public static int Remainder ( int A, int B) {
        return(A % B);
    }
}