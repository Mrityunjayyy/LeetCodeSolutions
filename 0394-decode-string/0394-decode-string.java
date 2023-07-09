class Solution {
    public String decodeString(String s) {
//The string s can be only 4 things according to the question constraints 
//[  or  ] or number(1-9) or alphaber(a-z)
     Deque<String> result = new ArrayDeque<String>();
     Deque<Integer> counts = new ArrayDeque<Integer>();   
     int  i = 0;
     String res = "";  //ye saari substrings store karegi abc jo 2-3 baar repeat hoga ans mai

      
      //while loop lagaya because ek sub condition ke liye i++ karenge
        while(i < s.length())
        {

// 1 condition - character is number
            if(Character.isDigit(s.charAt(i)))
            {
                int count = 0; //will push this counter into counts stack
                //the digit might be 12345 so run a loop
              while(Character.isDigit(s.charAt(i)))
              {
                  count = 10 * count + (s.charAt(i) - '0');
                   i++ ;
              }
                //push the number in the stack after it is made
                counts.push(count);
            }
 
//second condition if it is a opening bracket
//the previous sub string before it [ will be in res and push it into the stack
            else if(s.charAt(i) == '[')
            {
                result.push(res);
                res = "";
                i++;
            }

// closing bracket aane par ham result string banayenge 
            else if(s.charAt(i) == ']')
            {

                StringBuilder sb = new StringBuilder(result.pop());
                int count = counts.pop();

                for(int x = 0 ; x < count ; x++)
                {
                    sb.append(res);
                }

                res = sb.toString();
                i = i + 1 ;
            }


// 4th condition if not anything else it is a character and add it to res to make our substring
            else
            {
                res = res  +  s.charAt(i);
                i = i + 1 ;
            }
        }
   
   
   

        return res;
    }
}