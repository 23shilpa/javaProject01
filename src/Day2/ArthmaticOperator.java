package Day2Assignment;

public class ArthmaticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + a * b);
        System.out.println("a/b=" + a / b);
        System.out.println("b%a=" + a % b);
        int var10001 = a++;
        System.out.println("a++ = " + var10001);
        var10001 = a--;
        System.out.println("b-- = " + var10001);
        var10001 = a++;
        System.out.println("d++ = " + var10001);
        ++a;
        System.out.println("++d = " + a);
    }
}


