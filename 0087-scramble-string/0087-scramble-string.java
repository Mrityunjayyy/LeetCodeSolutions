class Solution {
    static HashMap<String , Boolean> map = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        return solve(s1 , s2);
    }

    public boolean solve(String a , String b)
    {
        if(a.equals(b) == true) return true;

        if(a.length() <= 1) return false;

        String key = a + " " + b;
        if(map.containsKey(key))
        return map.get(key);

        int n = a.length();
        boolean flag = false;

        for(int i = 1 ; i <= n-1 ; i++)
        {
            if( solve(a.substring(0 ,i) , b.substring(n-i))
            && solve(a.substring(i) , b.substring(0, n-i))

            || 

            solve(a.substring(0,i) , b.substring(0,i)) 
            && solve(a.substring(i) , b.substring(i) )

            )
            {
                flag = true;
                break;
            }
        }

        map.put(key , flag);
        return flag;
    }
} 