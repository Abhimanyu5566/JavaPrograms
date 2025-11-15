

public class SelectSort {

    public static void main(String[] args){

        int arrNum[] = {3,4,7,8,4,1,5};

        System.out.print("Before Select sort Arrays: ");

        for(int n:arrNum){System.out.printf("%d, ",n);}
        System.out.println();
        selectSort(arrNum);
    }
    public static void selectSort(int[] nums){

        int num = nums.length;
        
        for(int i = 0;i<num-1;i++){

            int min_value = nums[i];

            for(int j = i+1; j<num;j++){

                if(min_value > nums[j]){

                    nums[i] = nums[j];
                    nums[j] = min_value;
                    min_value = nums[i];
                }
            }

        }
        
        System.out.print("After Select Sort Number : ");
        for(int n:nums){

            System.out.printf("%d, ", n);
        }

        

    }
    
}
