package Practice;

public class Factorial {
    public static void main(String[] args) {
        int i = 1,fact = i+1;
        int number=5;
        for (i=1; i <= number; i++) {
            fact = fact+1;
        }
        System.out.println("Factorial of" +number+ "is: +fact");
    }
}
