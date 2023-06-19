class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length , columns = matrix[0].length ;

        int low = 0 , high = rows * columns -1 ;
        int midIdx , midElement ; 

        while(low <= high)
        { 
            midIdx = low + (high - low)/2 ; 
            int midRow = midIdx/columns;
            int midColumn = midIdx%columns ;

            midElement = matrix[midRow][midColumn];

            if(midElement == target)
            return true;

            else if(midElement < target)
            low = midIdx +1 ;

            else 
            high = midIdx -1;
            
        }
        return false;
    }
}

