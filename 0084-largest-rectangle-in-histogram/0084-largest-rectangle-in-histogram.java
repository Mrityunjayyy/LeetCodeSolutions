class Solution {
    public int largestRectangleArea(int[] heights) {
      int n = heights.length;
      int[] prevSmall = prev(heights , n);
      int[] nextSmall = next(heights , n);
      int area = 0;
      int maxArea = Integer.MIN_VALUE;

      for(int i = 0 ; i < n ; i++)
      { 
          area = (nextSmall[i] - prevSmall[i] -1 ) * heights[i];
          maxArea = Math.max(maxArea , area); 
      }

      return maxArea;
    }


    public int[] prev(int[] arr , int n)
    { 
        int[] ans = new int[n];
        Deque<Integer> s = new ArrayDeque<Integer>();

        for(int i = 0 ; i < n ; i++)
        {
            //stack contains the indices 
           while(!s.isEmpty() && arr[s.peek()] >= arr[i])
           { s.pop(); } 

           if(s.isEmpty())
           ans[i] = -1;
           else
           ans[i] = s.peek();

// storing indices and not the values
           s.push(i);
        }

        return ans;
    }


     public int[] next(int[] arr , int n)
    { 
        int[] ans = new int[n];
        Deque<Integer> s = new ArrayDeque<Integer>();

        for(int i = n -1 ; i > -1 ; i--)
        {
           while(!s.isEmpty() && arr[s.peek()] >= arr[i])
           { s.pop(); } 

           if(s.isEmpty())
           ans[i] = n;  // yaha par -1 ki jagah n daalna hai
           else
           ans[i] = s.peek();

           s.push(i);
        }

        return ans;
    }



} 