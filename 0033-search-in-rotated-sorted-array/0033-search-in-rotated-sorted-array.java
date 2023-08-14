class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(nums[0] <= nums[n-1])
        binarySearch(nums , 0 , n-1 , target);
       
        int index = findSmallestIndex(nums , nums.length);
        int leftAns = binarySearch(nums , 0 , index - 1 , target);
        int rightAns = binarySearch(nums , index , n-1 , target);

        return (leftAns ==-1 )? (rightAns == -1) ? -1 :rightAns  : leftAns;
    }


    public int findSmallestIndex(int[] arr ,int n)
    {
        int low  = 0;
        int high = n-1;

        while(low <= high)
        {
            int mid = low + (high -low )/2;

            int prev = (mid + n -1) %n;
            int next =  (mid + 1)%n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next])
            return mid;

            else if(arr[mid] <= arr[high])
            high = mid -1 ;

            else if(arr[low] <= arr[mid])
            low = mid + 1;       
        }

        return -1;
    }


    public int binarySearch(int[] arr , int low ,int high ,int target)
    {
        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] == target)
            return mid;
            
            else if(arr[mid] < target)
            low = mid +1 ;

            else 
            high = mid -1;
        }

        return -1;
    }
} 