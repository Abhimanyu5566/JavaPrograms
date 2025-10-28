import java.util.Scanner;

public class Palindrom {

    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter: ");
        String str = sc.nextLine();
        
        String result = (reverseString(str))?"Yes this is a Palindrom":" No this ia not Palindrom";
        
        System.out.printf("Output: %s", result);
        
        sc.close();
    }

    public static  boolean reverseString(String str){

        String temp = str, reverse ="";

        for(int i = 0; i< temp.length();i++){

            char ch = temp.charAt(i);

            reverse = ch+reverse;
        }

        System.out.printf("Reverse String: %s\n",reverse);

        return (str.equalsIgnoreCase(reverse))?true:false;

    }


    
}
