class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length -1 , low = 0 ; 
        while(low <= high)
        { 
            int mid  = low + (high -low)/2 ;

            if(nums[mid] == target)
            { 
                return mid;
            }

            else if(nums[mid] < target) //right side search
            { 
                 low = mid + 1;
            }

            else 
              high = mid -1;
           
        }
        return -1;
    }
}