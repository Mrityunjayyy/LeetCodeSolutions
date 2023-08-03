class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums)
        {
            sum += i;
        }

        if( (sum&1) != 0 )
        return false;
       


        return solveDP(nums , sum/2 , nums.length);
        
    }

    public boolean solveDP(int[] nums , int sum , int n)
    {
        boolean[][] t = new boolean[n+1][sum+1];

        for(int i = 0 ; i < n+1 ; i++)
        {
            t[i][0] = true;
        }

        for(int i = 1 ; i < n+1 ; i++)
        {
            for(int j = 1 ; j < sum + 1 ; j++)
            {
                if(nums[i-1] <= j)
                {
                    t[i][j] = t[i-1][j - nums[i-1]] || t[i-1][j];
                }
                else if(nums[i-1] > j)
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }


        return t[n][sum];
    }
}