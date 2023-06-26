class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
      
      findSum(ans , al , candidates , target , 0 , 0);

      return ans;
    }

    public void findSum(List<List<Integer>> ans, ArrayList<Integer> al , int[] nums,   int target , int total , int i)
 {
     if(total == target)
     { 
         ans.add(new ArrayList(al));
         return;
     }

     if(i >= nums.length || total > target)
     return;

     al.add(nums[i]);
     //here we dont do i+1 because we can use the same number again
     findSum(ans , al , nums , target , total  + nums[i], i );
     al.remove(al.size() -1);

        //dont pick
     findSum(ans , al , nums , target , total ,i+1 );


 }

}