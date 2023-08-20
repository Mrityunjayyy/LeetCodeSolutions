class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length -1] < target)
        return nums.length;

        return findCeil(nums , nums.length ,target);
        
    }

    public int findCeil(int[] arr , int n , int target)
    {
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high)
        {
            int mid = low + (high - low )/2;

            if(arr[mid] == target)
            return mid;

            else if(arr[mid] > target)
            {
                res = mid;
                high = mid -1;
            }

            else 
            low = mid +1;
        }

        return res;
    }
}