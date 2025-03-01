import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
     
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter two values:");

            int a = s.nextInt();
            int b = s.nextInt();
            int c = a + b;


            System.out.println("Result is :"+c);
        }
    }
}
