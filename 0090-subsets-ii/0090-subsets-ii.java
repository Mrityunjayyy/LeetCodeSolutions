class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     ArrayList<Integer> al = new ArrayList();
     int n = nums.length;
     Arrays.sort(nums);

     List<List<Integer>> ss = new ArrayList<List<Integer>>();

     
     printss(ss , al , 0 , n , nums);

     Set<List<Integer>> set = new HashSet<List<Integer>>(ss);
     ss.clear();
     ss.addAll(set);

     return ss;

        
    }


    public static void printss(List<List<Integer>> ss ,  ArrayList<Integer> al , int index, int n ,int[] nums)
    { 
        if(index == n)
        { 
                ss.add(new ArrayList(al));
                return;
        }


        printss(ss , al  , index +1 , n , nums);


        al.add(nums[index]);
        printss(ss , al  , index +1 , n , nums);
        al.remove(al.size() -1 );


       


    }
}