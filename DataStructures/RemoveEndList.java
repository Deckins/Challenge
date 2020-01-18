/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = temp;
        ListNode edge = head;
        boolean small = false;
        if(n == 1){
            if(edge.next == null){
                edge=edge.next;
                return edge;  
            } 
            // else {
            //     while(edge.next !=null){
            //         edge.next = edge.next.next;
            //         return edge;
            //     }
            // }
            
        }
       
        
        for(int i = 0; i<n; i++){
            
            if(head.next != null){
                head = head.next;
                
            } else {
                small = true;
            }
        }
        
         if(n == 2 && small == true){
            edge = edge.next;
            return edge;
        }
        while(head.next !=null){
            head = head.next;
            temp = temp.next;
        }
        if(temp.next != null) temp.next = temp.next.next;
        return temp2;
    }
}