class Solution {
    public boolean isValid(String s) {
        char[]chars = s.toCharArray();
        int n = chars.length;
        Stack<Character> stack1 = new Stack<>();

        for(char c : chars)
        { 
            if(c == '(' || c == '{' || c == '[')
            {
            stack1.push(c);
            continue;
            }

            else if(stack1.empty())
            return false;

            char top = stack1.pop();

            if(top == '(' && c != ')')
            return false;


            else if(top == '{' && c != '}')
            return false;

            else if(top == '[' && c != ']')
            return false;
    
        }

        return stack1.empty();
    }
} 