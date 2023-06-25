package Day2Assignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int input = scanner.nextInt();

        Day2Assignment.ReverseNumber reverseNumber = new Day2Assignment.ReverseNumber();

        int Num = reverseNumber.reverseNumber(input);

        if (input == Num) {

            System.out.println("the number palindrome number");
        } else {
            System.out.println("the number is not palindrome");

        }


    }

}
