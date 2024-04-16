// package DataStructures;

//time complexity - O(logn)
public class BinarySearch {

    public static void main(String[] args) {

        int nums[] = { 2, 6, 8, 9, 10, 17, 14 };
        int target = 17;
        
        // int result  = binarySearch(nums, target);
        int result  = binarySearch(nums, target,0,nums.length-1);
        
        if(result!= -1)
            System.out.println("Element found at position: " +result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] nums, int target, int begin, int end) 
    {
        // int begin = 0;
        // int end = nums.length -1;
        
        if(begin <= end)
        {
            int mid = (begin+end)/2;
            {
                if(nums[mid] == target)
                {
                    return mid;
                }
                else if(nums[mid] < target)
                {
                    return binarySearch(nums, target, mid+1, end);
                }
                else
                {
                    return binarySearch(nums, target, begin, mid-1); 
                }
            }           
        }

        /* 
        while(begin <= end)
        {
            int mid = (begin+end)/2;

            if(nums[mid] == target)
            {
                 return mid;
            }
            else if(nums[mid] < target)
            {
                begin = mid +1;
            }
            else
            {
                end = mid -1;
            }
            
        }
        return -1;
        */
        return -1;
    }
    
}

