package Practice;

public class MakeLetterA {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                    if (i == 1 || j == 5 || i == 3 || j == 1) {
                        System.out.println("*");
                    }else {
                        System.out.println(" ");
                    }
                }
                System.out.println();


            }
        }
    }
