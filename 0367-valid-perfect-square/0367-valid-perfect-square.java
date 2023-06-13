class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 0 , high = num ; 
        
        while( low <= high )
        {  
            
            long mid = low  + (high - low)/2 ;
            long result = mid * mid; 

            if(result == num)
            { 
               return true;
            }

            else if (result < num)
            {
                low = mid +1 ;
            }

            else 
            { high = mid -1; }

        }
        return false;
    }
}