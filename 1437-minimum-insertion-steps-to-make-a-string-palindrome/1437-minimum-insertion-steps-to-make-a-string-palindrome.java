class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        StringBuffer sb = new StringBuffer(s).reverse();

        int[][] t = new int[n+1][n+1];

        int lcs = LCS(s , sb.toString() , n , n , t);

        return n - lcs;
    }

    public int LCS(String a , String b , int m , int n ,int[][] t)
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