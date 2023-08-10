class Solution {
    static int[][] t = new int[2001][2001];
    static boolean[][] palindrome = new boolean[2001][2001];
    public int minCut(String s) {
        
        for(int[] a : t)
        {
            Arrays.fill(a , -1);
        }

        return solve(s , 0, s.length() -1);
    }

    public int solve(String s , int i , int j)
    {
        if(t[i][j] != -1)
        return t[i][j];

        if(i >= j || isPalindrome(s , i , j) == true)
        {
            t[i][j] = 0;
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int k = i ; k <= j-1 ; k++)
        {
            // int left;
            // if(t[i][k] != -1)
            // { 
            //     left = t[i][k];
            // }
            // else 
            // {
            //     left = solve(s , i , k);
            //     t[i][k] = left;
            // }

           

            if(isPalindrome(s , i ,k) == true)
            {   
                 int right;
            if(t[k+1][j] != -1)
            {
                right = t[k+1][j];
            }
            else 
            {
                right = solve(s , k+1 , j);
                t[k+1][j] = right;
            }
                
                int temp_ans = 1 + right;

            if(temp_ans  < min)
            {
                min = temp_ans;
            }
            }
        }

        return t[i][j] = min;
    }


     boolean isPalindrome(String s , int i  , int j)
    {
        if(palindrome[i][j] == true)  return true;

        if(i < 0 || j >= s.length()) return false;
        
        if(i == j) return true;
           
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return palindrome[i][j] = true;
    }
}