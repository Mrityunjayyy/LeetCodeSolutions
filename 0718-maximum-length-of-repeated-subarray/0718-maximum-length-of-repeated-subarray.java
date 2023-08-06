class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] t = new int[m+1][n+1];
        return dp(nums1 , nums2 , m , n , t);

    }

    int dp(int[] a, int[] b , int m , int n, int[][] t)
    {

         int max = Integer.MIN_VALUE;

        for(int i =1 ; i < m+1 ; i++)
        {
            for(int j =1 ; j < n+1 ; j++)
            {
                if(a[i-1] == b[j-1] )
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }      
                if(t[i][j] > max)
                {
                    max = t[i][j];
                }
                else if(a[i-1] != b[j-1])
                {
                    t[i][j] = 0;
                }
        
            }
        }


        return max;
    }
}