import java.util.Scanner;

public class SwappingNumber {
    
    public static void main(String... args){

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter First Number: ");
        long num1 = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Second Number: ");
        long num2 = sc.nextLong();
        
        System.out.printf("\n\nBefore Swapping \n\nFirst Number.: %d\nSecond Number: %d",num1,num2);

        num1 +=num2;
        num2 =num1-num2;
        num1 -=num2;

        System.out.printf("\noutput:\n\nAfter Swapping Number: \n\nFirst Number: %d\nSecond Number:%d",num1,num2);

        sc.close();

    }
    
}
