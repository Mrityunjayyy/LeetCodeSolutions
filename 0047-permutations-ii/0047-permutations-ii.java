class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        //sort the array whenever there are duplicates in the array
       Arrays.sort(nums);
       int n = nums.length; 
       int r = n-1;
       List<List<Integer>> al = new ArrayList<>();

       solve(al , nums , 0 , r ,n);

       //make a hashset to remove duplicates from a collection framework 
       //HashSet doesnot contain duplciates
       Set<List<Integer>> set = new HashSet(al);
       al.clear();
       al.addAll(set);

       return al;

    }


    public void solve(List<List<Integer>> al, int[] nums , int l , int r , int n)
    { 
        if(l == r)
        {
            List<Integer> temp = new ArrayList<Integer>();
            for(int i = 0 ; i < n ; i++)
            { 
                temp.add(nums[i]);
            }

            al.add(new ArrayList(temp));
        }


        else 
        {
            for(int i = l ; i<=r ; i++)
            {
            swap(nums , l , i);
            solve(al , nums ,l+1 , r , n);

            //backtracking 
            //swapping back the elements as they were
            //[B A C] -> [A B C]
            swap(nums , l , i);
            }
        }
    }



    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}