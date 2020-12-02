public class LastIndexOfString {
    public static void main (String[] args) {
        String statement = "Maydm is Made By Them, My Maydm is Made By Me! I'm learning to code in Java";
        int position = statement.lastIndexOf("Maydm");
        int location = statement.lastIndexOf("Made");

        System.out.println("Postition of Maydm: " + position);
        System.out.println("Position of made: " + location);
        System.out.println("the last '!' is at position " + statement.lastIndexOf("!"));
        System.out.println(statement.lastIndexOf("Maydm"));
    }
}