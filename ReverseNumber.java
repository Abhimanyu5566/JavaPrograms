import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Number: ");
        long num = sc.nextLong();

        System.out.printf("Output: %d\n",reverseNumber(num));

        sc.close();
    }

    public static long reverseNumber(long num){

        long tempNum = num, reverseNum = 0 ,remberNum;

        for (long i = tempNum; i > 0; ){

            remberNum = tempNum%10;
            reverseNum = reverseNum *10 + remberNum;
            tempNum/=10;
            i = tempNum;

            
        }

        return reverseNum;

    }
    
}
