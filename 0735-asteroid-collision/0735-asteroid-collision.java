class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        
        for(int i = 0 ; i < asteroids.length ; i ++)
        { 
            if(stack1.isEmpty() || asteroids[i] > 0)
            stack1.push(asteroids[i]);

// if the value is negative
            else
            { 
                 while(true)
                 {
                //top element is positive
                if(stack1.peek() < 0)
               {   stack1.push(asteroids[i]);
                    break;
               }

                //top element is same in mangnitude
                //collision both destroyed
                else if(stack1.peek() == -1 * asteroids[i])
                {
                    stack1.pop();
                     break ;
                 }

                //top element is positive but greater than asteroids[i]
                //collision but the greater element will stay in the stack
                else if(stack1.peek() > asteroids[i] * -1)
               { 
                   break; 
               }
            
            //top element is positive and less than the asteroids[i]
            //they will collide
            else if(stack1.peek() < asteroids[i] * -1)
            {
                //keep poping elements without break statement 
               stack1.pop(); 

               if(stack1.isEmpty())
               {
                   stack1.push(asteroids[i]);
                   break;
               }
            }

                 }
            }
        }


        int[] temp = new int[stack1.size()];
        for(int i = stack1.size() -1 ; i > -1 ; i--)
        {
            temp[i] = stack1.pop();
        }


        return temp;
    }
}