class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        long val = n & (n-1) ;
        if(val == 0) 
        return true; 
        else 
        return false;
    }
}