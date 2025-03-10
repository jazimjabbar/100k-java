import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {
        try (Scanner jazim = new Scanner(System.in)) {
            System.out.println("Enter a number ");

            float num = jazim.nextInt();

        float sum=0;
           for(float i=0;i<num+1;i++){
            sum=sum+i;
           }
           System.out.println("result is :"+sum);
        }
    }
}
