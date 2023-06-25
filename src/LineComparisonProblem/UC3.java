package LineComparisonProblem;

public class UC3 {
    public static void main(String[] args) {
        
        String str1 = new String("Testing");
        String str2 = "Testing";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

}
