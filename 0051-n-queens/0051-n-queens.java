class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> al = new ArrayList<>();

        makeEmptyBoard(al , n);

        return al;

    }

// this method will generate the n*n board with all entries as " . "
    public void makeEmptyBoard(List<List<String>> al, int n)
    {
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            { 
               board[i][j] = '.';
            }
        }

        putQueen(al, board, 0);

    }
   
   //this method will put queen on the board 
    public void putQueen( List<List<String>> al ,   char[][] board , int col)
    { 
        if (col == board.length )
        {
            al.add(makeStringList(board));
            return;
        }

        
        
            for(int row = 0 ; row < board.length ; row++)
            { 
                if(isValid(row , col , board))
                {
                    board[row][col] = 'Q';
                    putQueen( al ,  board , col +1 );
                    board[row][col] = '.';

                }
            }
        
    }
 
   // this funtion checks if other queen is attacking or not
    // attack from other queen can be only from left direction i.e upleft and downleft diagonal with left row
    public boolean isValid(int row , int col , char[][] board)
    {
        int m = row;  // temporary row and column 
        int n = col; 
        
        //upleft diagonal check
        while(row >= 0 && col >= 0)
        { 
            if(board[row][col] == 'Q') return false;
            row--; //moving upleft diagonal will decrease row and column;
            col--; 
        }

        row = m; 
        col = n;
        
        //left row check
        while(col >= 0)
        { 
            if(board[row][col] == 'Q') return false;
            col--;
        }
        
         row = m; 
         col = n;
        //downleft diagonal check
        while(row < board.length && col > -1)
        { 
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        
        return true;
    }


    public List<String> makeStringList(char[][] arr)
    {
        List<String> al = new ArrayList<String>();
        
        for(char[]  a : arr)
        { 
            String str = new String(a);
            al.add(str);
        }

        return al;
    }
}