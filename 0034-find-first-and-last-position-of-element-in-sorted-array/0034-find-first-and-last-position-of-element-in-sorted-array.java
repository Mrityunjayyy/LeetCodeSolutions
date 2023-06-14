class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int count = 0 ;
        int found= -1 ; 
        for(int i = 0 ; i < nums.length ;i++)
        { 
            if(nums[i] == target)
            { 
                found = i;
                count++;
            }
        }

        if(found == -1)
        { 
            result[0] = -1;
            result[1] = -1;
        }
        else
        {
            result[0] = found - count +1 ;
            result[1] = found;
        }
        

        return result;
    }
}