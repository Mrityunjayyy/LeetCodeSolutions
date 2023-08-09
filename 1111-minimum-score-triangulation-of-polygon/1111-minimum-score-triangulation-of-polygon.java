class Solution {
    static int[][] t = new int[51][51];
    public int minScoreTriangulation(int[] values) {
        int N = values.length;

        for(int[] a : t)
       {
           Arrays.fill(a , -1);
       }
   
       return solve(values , 1 , N-1);
    }

      public int solve(int[] arr , int i , int j )
    {
        if(i >= j)
        return 0;
        
        if(t[i][j] != -1)
        return t[i][j];
        
        int min = Integer.MAX_VALUE;
        
        for(int k = i ; k <= j-1 ; k++)
        {
            int temp_ans = solve(arr , i , k) + solve(arr ,k+1 , j) + (arr[i-1]*arr[k]*arr[j]);
        
            if(temp_ans < min)
            {
                min = temp_ans;
            }
        }
        
        
        return t[i][j] = min;
    }
}