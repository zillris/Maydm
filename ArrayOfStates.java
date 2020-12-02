public class ArrayOfStates {
    public static void main(String[] args) {
        String[] states = {"Wisconsin", "Illinois", "Minnesota", "Iowa", "Indiana, New York"};
        states = new String[5];
        states[0] = "california";
        states[4] = "Washington";
        states[3] = "Nevada";
        System.out.println(states[0]);
        System.out.println(states[4]);
        System.out.println(states[3]);

        int[]anArrayOfIntegers;
        anArrayOfIntegers = new int[10];
        anArrayOfIntegers[0] = 50;
        System.out.println(anArrayOfIntegers[0]);
        
    }
}