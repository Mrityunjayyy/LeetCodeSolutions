class Solution {
    public int maxProfit(int[] prices) {
      int minSoFar = prices[0];
      int maxProfit = Integer.MIN_VALUE;
        for(int i = 0 ; i < prices.length ; i++)
        { 
           minSoFar = Math.min(minSoFar , prices[i]);
           int profit = prices[i] - minSoFar;
           maxProfit = Math.max(maxProfit , profit);
        }

        return maxProfit ;
    }
}