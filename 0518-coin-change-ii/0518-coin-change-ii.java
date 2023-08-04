class Solution {
    public int change(int amount, int[] coins) {
        
        return subSets(coins , amount , coins.length);
    }


    public int subSets(int[] coins , int sum , int n)
    {
        int[] t = new int[sum+1];
        t[0] = 1;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = coins[i] ; j <= sum ; j++)
            {
                t[j] = t[j] + t[j - coins[i]];
            }
        }

        return t[sum];
    }
}