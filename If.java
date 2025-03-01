import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");

            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("The value is negative");
            } else if (num > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("YOU IS MONKEY FOOLISH");
            }
        }
    }
}
