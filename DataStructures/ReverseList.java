/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
      
        while(head !=null){
            stack.push(head.val);
            head = head.next;
        }
        Integer stackVal = 0;
        //Error handling to return head if stack is empty.
        if(!stack.empty()) {
            stackVal = stack.pop();
        } else {
            return head;
        }
        ListNode temp = new ListNode(stackVal);
        ListNode dummy = temp;
        while(!stack.empty()){
            ListNode node = new ListNode(stack.pop());
            temp.next = node;
            temp = temp.next;
        }
        return dummy;
    }
}