class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }


    public boolean solve(char[][] board)
    { 
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
            if(board[i][j] == '.')
            {

                for(char c = '1' ; c <= '9' ; c++)
                {
                    if(isValid(board , i , j , c))
                    {
                     //if it is valid to put a piece there put it
                      board[i][j] = c;
                      
                      //recursion to check for further blocks
                      if(solve(board) == true)
                      return true;
                       
             //backtrack in case a wrong number was put and remove it 
                       else
                       board[i][j] = '.';

                    }
                }

                //koi character nahi rakh paya
                return false;
            }
          }
        }

        // No empty blocks found just return true;
        return true;
    }
   

   public boolean isValid(char[][] board , int row , int column , char c)
   { 
       for(int i = 0 ; i < 9 ; i++) //i <9 suddoku is 9*9
       {
           //row checking
           if(board[row][i]  == c) return false;

            //column checking
           if(board[i][column] == c) return false;



 //the small 3*3 matrix check
          
        //this will give the inner 3*3 matrix row
           int m = 3 * (row/3) + i/3;
        
        //this will give the inner 3*3 matrix column
           int n = 3 * (column/3) + i%3 ;

           if(board[m][n] == c) return false;  
       }

       return true;
   }




}