class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     ArrayList<Integer> al = new ArrayList();
     int n = nums.length;

     List<List<Integer>> ss = new ArrayList<List<Integer>>();

     
     printss(ss , al , 0 , n , nums);


     return ss;

    }


    public static void printss(List<List<Integer>> ss ,  ArrayList<Integer> al , int index, int n ,int[] nums)
    { 
        if(index == n)
        { 
                ss.add(new ArrayList(al));
                return;
        }

        al.add(nums[index]);
        printss(ss , al  , index +1 , n , nums);
        al.remove(al.size() -1 );


       printss(ss , al  , index +1 , n , nums);


    }
    
    
    }