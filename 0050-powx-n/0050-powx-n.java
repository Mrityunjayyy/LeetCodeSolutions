class Solution {
    public double myPow(double x, int n) {
        
        //this is if the test cases have very huge values
       // long mod = 1_000_000_00_7l ;

        
        // I dont care if n is positive or negative I only send 
        //positive value to our function then return 1/result
        //if n was negative 
        long p = (long)n;
        double result = pow(x , (long)Math.abs(p));
        

        if(n < 0)
          return (double)(1/result);
        else 
        return result;
        
        
    }

    public double pow(double a , long b)
    { 
        double res = 1l;

        while(b > 0)
        { 
            if( (b & 1) != 0) //odd
            {
                res = res * a;
            }

            a = a * a;
            b = b>>1; // divide by 2
        }
        
        
        return res;
    }
}