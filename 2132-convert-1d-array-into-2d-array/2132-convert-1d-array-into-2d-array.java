class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
      
       int[][] arr = new int[m][n] ;
       int[][] empty = {};
         if( m*n != original.length)
        return empty;
       int x = 0 ;
       for(int i = 0 ; i < m && x < original.length  ; i++)
       { 
           for(int j = 0 ; j < n && x < original.length ; j++ , x++)
           { 
            arr[i][j] = original[x];
           }
         }
        
        

        return arr;
    }
}