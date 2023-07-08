class Solution {
    public int maximalRectangle(char[][] matrix) {
    
    // converting the char[][] to int[][]
    //this will make my life a lot easier 
    //and the question a lot easier to solve
    int[][] m = new int[matrix.length][matrix[0].length];

    for(int i = 0 ; i < matrix.length ; i++)
    {
        for(int j = 0 ; j < matrix[0].length ; j++)
        {
            m[i][j] = (matrix[i][j] == '0') ? 0 : 1 ;
        }
    }
   
    //curr will be the array similar to the histogram heights array
    //initialize it to the first row
    int[] curr =  m[0];
    int maxArea = findArea(curr);

    for(int i = 1 ; i < matrix.length ; i++)
    {
        for(int  j = 0 ; j < matrix[0].length ; j++)
        {
            //agar 1 hai to curr mai bar ki height +1 
            //0 hai to bar graph ki height 0
            curr[j] = (m[i][j] == 1) ? curr[j] + 1 :  0;    
        }
       
       //after every inner loop iteration we get new heights for the bars
       //for every curr array we find the area.
        int currArea = findArea(curr);
        maxArea = Math.max(maxArea , currArea);
    }

    return maxArea ;
    }

   // this is the logic of the histogram area problem
    public int findArea(int[] arr)
    {
        int[] prevSmall = prev(arr);
        int[] nextSmall = next(arr);
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++)
        { 
            int width = nextSmall[i] - prevSmall[i] -1;
            int area = width * arr[i];
            maxArea = Math.max(area , maxArea);
        }

        return maxArea ;
    }

  
  //simple prevSmall element code (using stacks)
    public int[] prev(int[] arr)
    {
        Deque<Integer> s = new ArrayDeque<Integer>();
        int[] ans = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++)
        {
        while(!s.isEmpty() && arr[s.peek()] >=  arr[i])
        { s.pop(); }
        
        if(s.isEmpty())
        ans[i] = -1;
        else
        ans[i] = s.peek();

        s.push(i);
        }

        return ans;
    }


//nextSmall element code (using Stacks)
    public int[] next(int[] arr)
    {
        Deque<Integer> s = new ArrayDeque<Integer>();
        int[] ans = new int[arr.length];

        for(int i = arr.length -1  ; i > -1 ; i--)
        {
        while(!s.isEmpty() && arr[s.peek()] >=  arr[i])
        { s.pop(); }
        
        if(s.isEmpty())
        ans[i] = arr.length; // ]dont assign -1 for next small give it n
        else
        ans[i] = s.peek();

        s.push(i);
        }

        return ans;
    }
} 