class Solution {
    public int[] diStringMatch(String s) {
     int n = s.length();
     Deque<Integer> dq = new ArrayDeque<Integer>();
     ArrayList<Integer> al = new ArrayList<Integer>();
     String ans = "";
   

     for(int i = 0 ; i <= n ; i++)
     { 
         dq.push(i);

         if(i == n || s.charAt(i) == 'I')
         {
             while(!dq.isEmpty())
             { al.add(dq.pop()) ; }
         }
     } 
    
    
    // char[] arr = ans.toCharArray();

    System.out.println(al);


    int[] temp = new int[al.size()];
    
     
    for (int i=0; i <= n ; i++)
    {
        temp[i] = al.get(i).intValue();
    }
    


    return temp;

    }
}