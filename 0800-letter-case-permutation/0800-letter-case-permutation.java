class Solution {
    public List<String> letterCasePermutation(String s) {
        s = s.toLowerCase();
        HashSet<String> ans = new HashSet();
        solve(ans ,s , "");
        return new ArrayList<String>(ans);
    }


    public void solve(HashSet<String> ans , String ip , String op)
    {
        if(ip.length() ==0)
        {
            ans.add(op);
            return;
        }

        String op1 = op;
        String op2 = op;

        if(Character.isDigit(ip.charAt(0)) )
        {
            op1 = op1 + ip.charAt(0);
            op2 = op2 + ip.charAt(0);
        }
        else 
        {
            op1 = op1 + Character.toUpperCase(ip.charAt(0));
            op2 = op2 + ip.charAt(0);
        }

        ip = ip.substring(1);

        solve(ans , ip , op1);
        solve(ans , ip , op2);
        
    }
}