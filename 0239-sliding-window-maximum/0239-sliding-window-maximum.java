class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        int i = 0;

        //first k elements
        for(i = 0 ; i < k ; i++)
        { 
        while(!stack1.isEmpty() && nums[stack1.peekLast()] <= nums[i])
            {  stack1.removeLast(); }

            stack1.addLast(i);
        }


    
        for(  ;  i < n ; i++)
        {
           al.add(nums[stack1.peek()]);


            while(!stack1.isEmpty() && stack1.peek() <= i-k)
            { stack1.removeFirst(); }

        while(!stack1.isEmpty() && nums[stack1.peekLast()] <= nums[i])
            {
                stack1.removeLast();
            }

            stack1.addLast(i);


        }

       al.add(nums[stack1.peekFirst()]);
   

        int[] ans = new int[al.size()];
        for(int x = 0 ; x < al.size() ; x++)
        { 
            ans[x] = al.get(x).intValue();
        }


        return ans;
    }
}