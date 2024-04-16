// package DataStructures;

public class MergeSort {

    public static void main(String[] args) {
        
        int nums[] = {3,6,5,1,4,2};

        System.out.print("Before Sorting:: ");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }

        mergeSort(nums, 0,nums.length-1 );



        System.out.println();
        System.out.print("After Sorting:: ");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] nums, int left, int right) 
    {
        if(left<right)
        {
           int  mid= (left+right)/2;
           mergeSort(nums, left, mid);
           mergeSort(nums, mid+1, right);
           merge(nums,left,mid,right);

        }

    }

    private static void merge(int[] nums, int left, int mid, int right) 
    {
        int n1 = mid-left +1;
        int n2 = right - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];   
        
        for(int x=0;x<n1;x++)
        {
           lArr[x] =  nums[left+x];
        }
        for(int x=0;x<n2;x++)
        {
           rArr[x] =  nums[mid+1+x];
        }

        int i=0;
        int j=0;
        int k =left;

        while (i<n1 && j<n2) 
        {
            if(lArr[i] <= rArr[j])
            {
                nums[k] = lArr[i];
                i++;
            }
            else
            {
                nums[k] = rArr[j];
                j++;
            }
        k++;
        }

        while (i<n1) 
        {
           nums[k] = lArr[i] ;
           i++;
           k++;
        }
        while (j<n2) 
        {
           nums[k] = rArr[j] ;
           j++;
           k++;
        }

        

    }
    
}
