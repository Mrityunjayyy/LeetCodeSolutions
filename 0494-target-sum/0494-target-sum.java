class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      int sum = 0 ; 
      for(int i : nums)
      {
          sum += i;
      }
      
      //target hi bohat bada negative value de dia 
      if (sum + target < 0) return 0;

      int check =   sum + target;
      if( (check & 1 ) != 0) // sum + diff is odd then
      // (sum+diff)/2 will not be a whole number so not possible.
      return 0;
      
      int s1 = check/2;

      return subSets(nums , s1 , nums.length);
 
    }

    public int subSets(int[] nums  , int sum , int n)
    {
        int[][] t = new int[n+1][sum+1];

        t[0][0] = 1;

        for(int i =1  ; i < n+1 ; i++)
        {
            for(int j = 0 ; j < sum +1 ; j++)
            {
                if(nums[i-1] <= j)
                {
                    t[i][j] = t[i-1][j - nums[i-1]] + t[i-1][j];
                }
                else 
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}