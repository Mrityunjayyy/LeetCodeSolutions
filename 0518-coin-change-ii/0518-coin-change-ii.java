class Solution {
    public int change(int amount, int[] coins) {
        
        return subSets(coins , amount , coins.length);
    }


    public int subSets(int[] coins , int sum , int n)
    {
        int[][] t = new int[n+1][sum+1];

        t[0][0] =1;

        for(int i =1 ; i < n+1 ; i++)
        {
            for(int j = 0 ; j < sum +1 ; j++)
            {
                if(coins[i-1] <= j)
                {
                    t[i][j] = t[i][j - coins[i-1]] + t[i-1][j];
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