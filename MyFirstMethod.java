public class MyFirstMethod{
    public static void firstFunction(int x, int y) {
        System.out.println("The sum is: " + (x+y));
        System.out.println("The product is: " + (x*y));

        if  (x < y) {
            System.out.println(x + "is less than" + y);
        }
        else if (y < x) {
            System.out.println(y + " is less than " + y);
        }
        else {
            System.out.println("The numbers are equal.");
        }
        System.out.println();
    }
    public static void main( String[] args ) {
        firstFunction(42, 9);
        firstFunction(74, 13);
        firstFunction(3*4*5, 10*6);
    }
}