class HelpSystem {
    public static void main(String[] args) throws java.io.IOException {
            char choice;
            String number;

            System.out.println("What would you like help on:");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("Choose one: ");

            choice = (char) System.in.read();
                //Scanner keyboard = new Scanner(System.in);

            switch(choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (condition) statement;");
                    System.out.println("else statement");

                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch (epression) {");
                    System.out.println("  case constant:");
                    System.out.println("    statement sequence ");
                    System.out.println("    break;");
                    System.out.println("  // ...");
                    System.out.println("}");
                    break;
                default:
                    System.out.print("Sorry " + choice + " not found");
            }  
    }
}