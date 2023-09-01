class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList();
        solve(ans ,s , "");
        return ans;
    }


    public void solve(List<String> ans , String ip , String op)
    {
        if(ip.length() ==0)
        {
            ans.add(op);
            return;
        }

        if(Character.isLetter(ip.charAt(0)) )
        {
            String op1 = op;
            String op2 = op;


            op1 = op1 + Character.toUpperCase(ip.charAt(0));
            op2 = op2 + Character.toLowerCase(ip.charAt(0));

            ip = ip.substring(1);
            solve(ans , ip , op1);
            solve(ans , ip , op2);

            
        }
        else 
        {
            String op1 = op;
            op1 = op1 + ip.charAt(0);
            ip = ip.substring(1);
            solve(ans , ip , op1);    
        }

       

     
        
    }
}