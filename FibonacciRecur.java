import java.util.Scanner;

public class FibonacciRecur{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(fibonacci(num));

        sc.close();

    }

    public static int fibonacci(int num){

        if(num == 0){
            return 0;

        }else if(num ==1){

            return  1;

        }else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}