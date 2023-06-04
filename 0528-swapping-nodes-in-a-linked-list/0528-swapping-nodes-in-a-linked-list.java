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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head ;
        int size = 0;
        int x = 0;

        while(temp != null)
        { 
            size++ ;
            temp = temp.next ;
        }
        


       ListNode startPtr = head;
        for(int i = 1 ; i <= k-1 ; i++)
        startPtr = startPtr.next ;

        System.out.println(startPtr.val);

        ListNode endPtr = head ;
        for(int i= 1 ; i <= size - k ; i++)
        endPtr = endPtr.next ;

        
        System.out.println(endPtr.val);


        x = startPtr.val ;
        startPtr.val = endPtr.val ; 
        endPtr.val = x ;



        return head; 
     
    }
}