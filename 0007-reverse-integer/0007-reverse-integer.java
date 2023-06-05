class Solution {
    public int reverse(int x) {
     long num = x ;
     long rev = 0;

     while(num != 0)
     { 
         rev = rev*10 + num%10 ; 
         num = num/10 ;
     }        
      System.out.println(rev);


    //  if(  rev > -2147483648 && rev < 2147483647)
    //   return rev;
    //  else 
    //   return 0;

    if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
    { 
        return 0;
    }
    else
    { 
         return (int)rev;
    }
  
    }
}