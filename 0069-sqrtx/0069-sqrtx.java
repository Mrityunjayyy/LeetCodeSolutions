class Solution {
    public int mySqrt(int x) {
       long low = 0 , high = x, result =-1L; 
        while(high >= low)
        { 
            long mid = low + (high-low)/2;
            long val = mid*mid;

            if(val == x)
            { 
                return (int)mid;
            }

            else if(val < x)
            { 
                result = mid; 
                low = mid +1 ;
            }

            else 
            high = mid -1;
        }

        return (int)result;
    }
}