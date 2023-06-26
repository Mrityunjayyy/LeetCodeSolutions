class Solution {

    //backtracking pw in class video - anjali sheel mam 
    public List<List<Integer>> permute(int[] nums) {

       List<List<Integer>> al = new ArrayList<>();
       int r = nums.length -1; 

       pp(al , nums , 0 , r);

       return al;
    }

    public void pp(List<List<Integer>> al , int[] nums, int l , int r )
    {
        if(l == r)
        { 
            //only way to get List<Integer> from an int[]
            List<Integer> temp = new ArrayList<Integer>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                temp.add(nums[i]);
            }

            al.add(new ArrayList<Integer>(temp));
        }

        else
        {  
            // we want to swap from l to r(nums.length -1)
            for(int i = l ; i <= r ; i++)
            {
            swap(nums , l , i);
            pp(al ,nums , l+1 , r); //recursive call to get all combinations
            
            //backtracking
            //[B A C] again swapped back to [A B C]
             swap(nums , l , i);
            }
        }
    }

   
   //funtion to swap the values
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}