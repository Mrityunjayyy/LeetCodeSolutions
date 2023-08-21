class Solution {
    public int singleNonDuplicate(int[] nums) {

        //** imprtant trick for this questions the single element can only occur at an even index for 0 based idnexing ATQ   */
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low < high)
        {
            int mid = low + (high - low)/2;
            if((mid&1) != 0) //condition for odd
            mid--;

            if(nums[mid] != nums[mid+1])
            high = mid ;

            else
            low = mid + 2;
        }

        return nums[low];
    }
}