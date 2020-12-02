public class IndexOfString {
    public static void main (String[] args) {
        String statement = "Maydm is Made By them, My Maydm is Made By me! I'm learning to cod in Java!";
        int position = statement.indexOf("Maydm");
        int location = statement.indexOf("Made");
        int spot = statement.indexOf("Rockin!");

        System.out.println("Position of Maydm: " + position);
        System.out.println("Position of Made: " + location);
        System.out.println("Position of Rockin!" + spot);
        System.out.println("the first '!' is at position " + statement.indexOf("!"));
        System.out.println(statement.indexOf("maydm"));
    }
}        