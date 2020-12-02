public class CompareStrings {
    public static void main(String[] args) {
        String wordOne = "Something different";
        String wordTwo = "Same";
        String wordThree = "Same";
        String wordFour = "SAME";

        System.out.println("Is \""  + wordOne + "\" the same as \"" + wordThree + "\" ?");
        System.out.println(wordOne.equals(wordTwo));
        System.out.println("Is \"" + wordTwo + "\" the same as \"" + wordThree + "\" ?");
        System.out.println(wordTwo.equals(wordThree));
        System.out.println("Is \"" + wordThree + "\" the same as \"" + wordFour + "\" ?");
        System.out.println(wordThree.equals(wordFour));
    }
}