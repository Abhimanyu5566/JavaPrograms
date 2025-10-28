
import java.util.Scanner;

public class Fibonacci{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int count = sc.nextInt();

        fibonacciSerise(count-2);

        sc.close();



    }

    public static void fibonacciSerise(int num){

        int prev1 = 0, prev2 = 1;
        System.out.printf("%d, %d, ",prev1,prev2);
        while(num>0){

            int sum = prev1 +prev2;
            System.out.printf("%d, ",sum);
            prev1 = prev2;
            prev2= sum;
            num--;
        }

    }
}