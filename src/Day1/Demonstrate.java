package Day1Assignment;

public class Demonstrate {
    static int x = 10;
    static int y;
    public static void main(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
    static {
        System.out.println("Running static initialization");
        y = x + 5;

    }
    public static void main(String[] args) {

    }
}
