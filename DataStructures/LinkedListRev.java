/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
       
        long val1 = 0L;
        long val2 = 0L;
        while(l1 != null){
            val1 = val1 *10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            val2 = val2 *10 + l2.val;
            l2 = l2.next;
        }
        long sum = val1 + val2;
      
        ListNode l3 = new ListNode(0); 
        ListNode temp = l3;
        
        while(sum != 0){
            // l3. = (sum % 10);
            l3.next = new ListNode((int)sum % 10);
            l3 = l3.next;
            sum = sum /10;
        }

        if(val1 == 0 & val2 == 0){
            return l3;
        }
        return temp.next;
        
    }
}