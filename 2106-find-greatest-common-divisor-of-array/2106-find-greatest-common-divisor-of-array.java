class Solution {
    public int findGCD(int[] nums) {
      Arrays.sort(nums);
      int min = nums[0];
      int max = nums[nums.length - 1];
      return gcd(max , min);
    }

    public int gcd(int a , int b)
    { 
        return (a%b == 0) ? b  : gcd( b , a%b);
    }
}