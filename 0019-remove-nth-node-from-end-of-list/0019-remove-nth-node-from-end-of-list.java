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
        int count = 0; 
        ListNode temp = head; 
        while(temp != null)
        { 
                count++;
                temp = temp.next; 
        } 

        System.out.println(count);

        if(n > count || count == 1)
        return null;

        if(count == n)
        { return head.next ;}

        temp = head ; 
        for(int i =1 ; i <= count -n - 1 ; i++)
        { 
            temp = temp.next;
        }

         System.out.println("temp is at" + temp.val);

         temp.next = temp.next.next;

        return head;
    }
}