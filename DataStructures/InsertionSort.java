// package DataStructures;

public class InsertionSort {

    public static void main(String[] args) {
        
        int nums[] = {4,3,2,10,12,1,5,6};
        int size = nums.length;
        int j =0;


        System.out.print("Before Sorting :: ");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
        // 4,3,2,10,12,1,5,6
        //3,4,2,10,12,1,5,6
        //

        for(int i=1;i<size;i++)
        {
            int key = nums[i];
            j = i-1;

            while(j>=0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] =key;
        }

        
        System.out.println();
        System.out.print("After Sorting :: ");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }

    }
    
}
