class Solution {
    //stack next greater element question
    //Mrityunjay
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i = n -1  ; i > -1 ; i--)
        { 
            while(!stack1.isEmpty() 
            && temperatures[stack1.peek()] <= temperatures[i] )
            { stack1.pop(); }

            if(stack1.isEmpty())
            ans[i] = 0;
            else 
            ans[i] = stack1.peek() - i; //-i is the complete logic of this question


            stack1.push(i);
        }

         return ans;
    }
}