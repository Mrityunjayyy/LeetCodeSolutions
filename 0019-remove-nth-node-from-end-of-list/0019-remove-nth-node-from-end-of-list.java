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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head ; 
        int count = 0;

        if(head == null)
        return null ;


        while(temp != null)
        { 
            count++;
            temp = temp.next;   
        }

        temp = head ;

        for(int i = 1 ; temp != null && i <= count - n -1 ; i++)
        { 
          temp = temp.next;
        }

        if(count == n)
        { 
           head = head.next;
        }

        if(temp == null || temp.next == null)
        { 
            return null;
        }


    

     

        temp.next = temp.next.next ;

        return head;


        
    }
}