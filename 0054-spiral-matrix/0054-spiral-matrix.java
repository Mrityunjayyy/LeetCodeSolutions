class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> al  = new ArrayList<Integer>();

    int rows = matrix.length ;
    int col = matrix[0].length ;

    int left = 0; 
    int top = 0 ;
    int right = col -1;
    int bottom = rows -1;


    while(left <= right && top<= bottom)
    { 
        //moving from left to right
        for(int i = left; i <= right ; i++)
        al.add(matrix[top][i]);

        top++;


        //movin top to bottom
        for(int i = top ; i <= bottom ; i++)
        {
            al.add(matrix[i][right]);
        }

        right--;

        //moving right to left
        if(top <= bottom)
        {
            for(int i = right ; i >= left ; i--)
            {
                al.add(matrix[bottom][i]);
            }

            bottom--;
        }


        //moving top to bottom 
        if(left <= right)
        {
            for(int i = bottom ; i >= top ; i--)
            {
                al.add(matrix[i][left]);
            }

            left = left + 1;
        }

    }




    return al;
    }
}