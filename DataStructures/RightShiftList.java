/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = head.next;
        ListNode slowDummy = head;
        // dummy = dummy.next;
        for(int i =0; i<k;i++){
            dummy = head.next;
            slowDummy = head;
            while(dummy.next != null){
                
                dummy = dummy.next;
                slowDummy = slowDummy.next;
            }
            System.out.println("Slow: " + slowDummy.val);
            System.out.println("Normal: " + dummy.val);
            System.out.println("Head " +head.val);
            
            dummy.next = head;
            head = dummy;
            System.out.println("Head AFTER " +head.val);
            while(dummy != slowDummy){
                dummy = dummy.next;
            }
            dummy.next = null;
            System.out.println();
        }
        
       return head;
    }
}