class Solution {
    public int[] twoSum(int[] nums, int target) {
      ArrayList<Integer> al = new ArrayList();
        for(int i = 0 ; i < nums.length ; i++)
        { 
          for(int j = i+1 ; j < nums.length ; j++)
          { 
            if(nums[i] + nums[j] == target)
            {
            al.add(i);
            al.add(j);
            }
          }
        }

        int[] result = new int[al.size()];
        for(int i = 0 ; i < al.size() ; i++)
        result[i] = al.get(i);


        return result;
    }
}