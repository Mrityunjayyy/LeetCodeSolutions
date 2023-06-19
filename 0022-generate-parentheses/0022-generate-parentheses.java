class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> al = new ArrayList<String>(); 
        pp(al ,n , 0 , 0 , ""); 
        // System.out.println(al);
         return  al;
    }
  

   public static void pp(ArrayList<String> al ,int n , int oc , int cc , String ans)
    { 
       

        if(n == oc && n == cc)
        {
            al.add(ans);
            return;
           // System.out.println(ans);
        }

        if(oc < n)
        {
            pp(al ,n , oc + 1 , cc , ans  + "(");
        }

        if(oc > cc)
        {
            pp(al , n , oc , cc +1 , ans + ")");
        }

    }
}