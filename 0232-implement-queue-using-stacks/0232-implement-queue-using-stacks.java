class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {

        if(stack1.empty() && stack2.empty())
        return -1;

        int ele;

        if(stack2.empty())
        { 
            while(!stack1.empty())
            {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        ele = stack2.pop();
        return ele;
    }
    
    public int peek() {
         if(stack1.empty() && stack2.empty())
        return -1;

        int ele;

        if(stack2.empty())
        { 
            while(!stack1.empty())
            {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        ele = stack2.peek();
        return ele;
    }
    
    public boolean empty() {
        
        if(stack1.empty() && stack2.empty())
        return true;
        else
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */