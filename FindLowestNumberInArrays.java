


public class FindLowestNumberInArrays{

    public static void main(String args[]){
        
        int arr[] = {50,85,8,74,9,4,76};

        int lowestValue = arr[0];

        for(int i = 0; i< arr.length;i++){

             System.out.println(lowestValue);
            if(lowestValue > arr[i]){

                lowestValue = arr[i];

                System.out.println("Check "+lowestValue);

            }
        }


        System.out.printf("Output: \nLowestNumber is: %d",lowestValue);
        


    }
}