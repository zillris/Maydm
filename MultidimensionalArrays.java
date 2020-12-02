public class MultidimensionalArrays {
    public static void main (String[] args) {
        String[][] statesAndCapitols = {{"Madison", "Springfield", "Rochester"}, {"Wisconsin", "Illinois", "Minnesota"}};
        int[][][] numberMatrix = {{{2, 4, 6}, {5, 10, 15}}, {{10, 20, 30, 40, 60, 30, 60, 90}}};

        System.out.println(statesAndCapitols[0][0]);
        System.out.println(numberMatrix[1][0][8]);

        int myFavoriteNumber = numberMatrix[0][1][2];

        String[] myStateAndCapitol;
        myStateAndCapitol = new String[2];
        myStateAndCapitol[0] = statesAndCapitols[0][0];
        myStateAndCapitol[1] = statesAndCapitols[1][0];
        System.out.println(myFavoriteNumber);
        System.out.println(myStateAndCapitol[0] + ", " + myStateAndCapitol[1]);
    }
}