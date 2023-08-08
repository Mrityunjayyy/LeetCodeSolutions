class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m+1][n+1];

        int lcs = LCS(s , t , m , n , dp);

        return lcs  == m;


    }

    public int LCS(String a , String b , int m , int n , int[][] t)
    {
        for(int i = 1 ; i < m+1 ; i++)
        {
            for(int j = 1 ; j < n+1 ; j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else 
                {
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }

        return t[m][n];
    }
}