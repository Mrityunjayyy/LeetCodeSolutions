class Solution {
    public boolean isAnagram(String s, String t) {
        //not equal length cannot be anagram
        if(s.length() != t.length())
        return false;


        int[] count = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        { 
            //ASCII value of a is 97 
            //ASCII value of A if 65

            //the -a will return the corresponding address in the count array 
            //one time ++ and one time -- so that all the elemebts remain 0
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
    
    // if every entry is not zero not an anagaram.
        for(int a : count)
        { if(a != 0) return false;}

        return true;
    }
}