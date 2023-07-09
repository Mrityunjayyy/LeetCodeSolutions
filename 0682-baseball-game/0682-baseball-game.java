class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
         int ans = 0;
           for(int i = 0 ; i < operations.length ; i++)
           {
              int index = 0;
               
             if(Character.isDigit(operations[i].charAt(index)) )
              {    
                  int count = 0;
                  while(index < operations[i].length() &&
                  Character.isDigit(operations[i].charAt(index))
                       )
                  {
                  count = 10 * count + (operations[i].charAt(index) - '0');
                  index++;
                  }
                  
                  index = 0 ;
                  stack1.push(count);
               }

                index = 0;

               if(operations[i].charAt(index) == '-' )
               {  
                 index = 1;
                  int count = 0;
                  while(index < operations[i].length() &&
                  Character.isDigit(operations[i].charAt(index))
                       )
                  {
                  count = 10 * count + (operations[i].charAt(index) - '0');
                  index++;
                  }
                  
                  index = 1 ;
                  stack1.push(-1 * count);
               }

              else if(operations[i].equals("+"))
              {
                  int ele = stack1.pop();
                  int temp = ele + stack1.peek();
                  stack1.push(ele);
                  stack1.push(temp);
              }

             else if(operations[i].equals("D"))
             {
                 int ele = stack1.peek() * 2 ;
                 stack1.push(ele);
             }

             else if(operations[i].equals("C"))
             {
                 stack1.pop();
             }

           }
        
        System.out.println(stack1);
       
        

        while(!stack1.isEmpty())
        {
            ans += stack1.pop();
        }

        return ans;
    }
}