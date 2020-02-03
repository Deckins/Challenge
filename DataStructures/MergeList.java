/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null && l2 != null){
            if(l1.val == l2.val){
                dummy.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l1.val < l2.val){
                dummy.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if(l2.val < l1.val){
                dummy.next = new ListNode(l2.val);
                l2 = l2.next;
                
            }
            dummy = dummy.next;
        }

        if(l1 !=null){
            //check why dummy.next = new ListNode(1l.val) does not work like below
            dummy.next = l1;
            l1 = l1.next;
            
        }
        if(l2 !=null){
            dummy.next = l2;
            l2 = l2.next;
        }
        return cur.next;
    }
}