class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n  = nums.length; 
        List<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        { 
            nums[i] -= 1;
            nums[nums[i] % n] += n;
        }

        for(int i = 0 ; i < n ; i++)
        { 
            if(nums[i]/n > 1 )
            al.add(i+1);
        }

        return al;
    }
}