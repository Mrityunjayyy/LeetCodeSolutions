class Solution {
    public int climbStairs(int n) {
        int first  = 1 , second = 1 , next = 0; 
        if(n <= 1)
        return n;

        for(int i = 0 ; i <= n -2 ; i++)
        { 
            next =  first  + second; 
            first = second; 
            second = next;
        }

        return next;
    }
}