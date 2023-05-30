/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al1 = new ArrayList();
        ListNode temp = head; 
        boolean flag = false ;
        while(temp != null)
        { 
            al1.add(temp.val); 
            temp = temp.next;
        }

         for(int i = 0 , j = al1.size() - 1 ; i < (al1.size()/2) ; i++ , j-- ) 
         { 
             if(al1.get(i) != al1.get(j))
             { 
                 flag = true ; 
                 break ;
             }
         }
         if(!flag)
         { 
             return true;
         }
         else
         { 
             return false;
         }
    }
}