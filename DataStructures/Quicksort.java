// package DataStructures;

public class Quicksort {

    public static void main(String[] args) {

        int nums[] = {51,13,6,1,4,2};

        System.out.print("Before Sorting :: ");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }

        quickSort(nums, 0, nums.length-1);

        System.out.println();
        System.out.print("After Sorting :: ");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
        
    }

    public static void quickSort(int[] nums, int low, int high) 
    {
        if(low < high)
        {
            int pi =  partition(nums,low,high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) 
    {
        int pivot = nums[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(nums[j]< pivot)
            {
                i++;
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high]= temp;

        return i+1;

    }
    
}
