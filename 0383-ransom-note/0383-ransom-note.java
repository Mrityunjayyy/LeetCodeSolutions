class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character , Integer> map1 = new HashMap<>();
       HashMap<Character , Integer> map2 = new HashMap<>();
       boolean flag  = true;

//for ransome note
       for(int  i = 0 ; i < ransomNote.length() ; i++)
       { 
           char c = ransomNote.charAt(i);
           if(map1.containsKey(c))
           { 
               map1.put(c , map1.get(c) + 1 );
           }
           else
           { 
               map1.put(c , 1);
           }
       }

//for magazine 
       for(int  i = 0 ; i < magazine.length() ; i++)
       { 
           char c = magazine.charAt(i);
           if(map2.containsKey(c))
           { 
               map2.put(c , map2.get(c) + 1 );
           }
           else
           { 
               map2.put(c , 1);
           }
       }


       for(Map.Entry<Character , Integer> e : map1.entrySet())
       { 
           if(!map2.containsKey(e.getKey()) 
           || e.getValue() > map2.get(e.getKey()) )
           { 
               flag = false;
               break;
           }

       }



         return flag;
        
    }
} 