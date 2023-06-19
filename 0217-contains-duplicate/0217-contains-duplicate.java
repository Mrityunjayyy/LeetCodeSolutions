class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet();

        for(int a : nums)
        { 
            if (n.contains(a)) return true;
            

            n.add(a);
        }

        return false;
    }
}