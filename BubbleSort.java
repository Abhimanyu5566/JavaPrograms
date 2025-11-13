

public class BubbleSort{

    public static void main(String[] args){


        int arrNum[] = {10,20,54,74,84,1,45,5};

        System.out.println("Before Sort Array list");
        for(int num:arrNum){System.out.printf("%d, ",num);}

        for(int i=0; i< arrNum.length-1;i++){

            for(int j = 0; j<arrNum.length-i-1; j++){

                if(arrNum[j]>arrNum[j+1]){
                    
                    int temp = arrNum[j];
                    arrNum[j] = arrNum[j+1];
                    arrNum[j+1] = temp;

                }

            }
        }
        System.out.println("\nAfter Sort Array list");
        for(int num:arrNum){System.out.printf("%d, ",num);}
        


    }
}