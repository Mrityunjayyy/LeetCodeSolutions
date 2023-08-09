class Solution {
    public List<List<String>> partition(String s) {
     List<List<String>> ans = new ArrayList<>();
     List<String> a = new ArrayList<>();
    
     solve(0 , ans , a , s);

     return ans;
    }

    public void solve(int index, List<List<String>> ans , List<String> a, String s)
    {
        if(index == s.length())
        {
            ans.add(new ArrayList<>(a));
            return;
        }

        for(int i = index ; i < s.length() ; i++)
        {
            if(isPalindrome(s , index , i))
            {
                a.add(s.substring(index , i+1));
                solve(i+1 , ans , a , s);
                a.remove(a.size() -1);
            }
        }
    }


    public boolean isPalindrome(String s , int i , int j)
    {
        if(i < 0 || j >= s.length()) return false;

         if(i == j) return true;

         while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return  true;
    }

}