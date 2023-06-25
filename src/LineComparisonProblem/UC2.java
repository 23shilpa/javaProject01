package LineComparisonProblem;

public class UC2 {
    public static void main(String[] args)
    {


        String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");


        System.out.println(s1 + " .equals " + s2
                + ": " + s1.equals(s2));


        System.out.println(s1 + " .equals " + s3
                + ": " + s1.equals(s3));


        System.out.println(s2 + " .equals " + s3
                + ": " + s2.equals(s3));

        System.out.println(s1 + " .equals " + s4
                + ": " + s1.equals(s4));
    }
}

