public class DeclareArrayLiterals {
    public static void main(String[] args) {

        String[] cities = {"Madison, Milwaukee, Green Bay"};

        int[] numbers = {1, 2 ,4 , 8, 16, 32, 64, 128};

        System.out.println(cities[0]);
        System.out.println(cities[2]);

        cities[0] = "Chicago";
        cities[1] = "St.Paul";
    }
}