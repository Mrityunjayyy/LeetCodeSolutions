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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ll = new ListNode(); 
        ListNode currentNode = ll ; 
        int sum = 0 ,carry = 0 ,lastDigit = 0; 

       while( l1 != null || l2 != null)
       { 
         int val1 = (l1 != null )? l1.val : 0 ;
         int val2 = (l2 != null )? l2.val : 0 ;
         sum = val1 + val2 + carry ;
         carry = sum/10 ; 
         lastDigit = sum%10 ;

         currentNode.next = new ListNode(lastDigit) ;

         if(l1 != null)
         l1 = l1.next ; 
         if(l2 != null)
         l2 = l2.next ;
         currentNode = currentNode.next ; 
       }

       if(carry > 0)
       { 
         currentNode.next = new ListNode(carry) ;
       }

       return ll.next ;
}
}











/** tentative first approach  */
//  int sum1 = 0 , sum2 = 0 , result = 0 ; 
    //     int multiplier = 1 ;
    
    //     ListNode temp1 = l1 , temp2 = l2  ;

    //     while(temp1 != null)
    //     { 
    //        sum1 = sum1 + (temp1.val * multiplier) ;
    //        temp1 = temp1.next ;
    //        multiplier =  multiplier * 10 ;

    //     }

    //     multiplier = 1 ;

    //     while(temp2 != null)
    //     {   
    //        sum2 = sum2 + (temp2.val * multiplier) ;
    //        temp2 = temp2.next ;
    //         multiplier =  multiplier * 10 ;
    //     }
       

    //     result = sum1 + sum2 ;
        
    //     while(result > 0)
    //     { 
          
    //       currentNode.next = new ListNode(result%10) ;
    //       result = result/10 ;
    //       currentNode = currentNode.next ;
    //     }
       
    //    currentNode = ll ;
       
    //   if(currentNode.val == 0 && currentNode.next == null)
    //   { 
    //     return ll ;

    //   }
    //   else 
    //   { 
    //     return currentNode.next ;

    //   }
      
    // }