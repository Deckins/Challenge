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
      
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        
        long val1 = 0L;
        long val2 = 0L;
        long rev1 = 0L;
        long rev2 = 0L;
        boolean flag1 = false;
        boolean flag2 = false;
        int count1 = 0;
        int count2 = 0;
        //Sets condition up for continous beginning 0s
        if(l1.val == 0){
            flag1 = true;
        }
        if(l2.val == 0){
            flag2 = true;
        }
        
        while(l1 != null){
            //keeps track of the number of continous 0s
            //flag is set to false once no longer continuous
            if(l1.val == 0 && flag1 == true){
                count1++;
            } else {
                flag1=false;
            }
            val1 = val1 *10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
              if(l2.val == 0 && flag2 == true){
                count2++;
            } else {
                flag2=false;
            }
            val2 = val2 *10 + l2.val;
            l2 = l2.next;
        }
        //Reverses the numbers in the linkedlist for each value
        while(val1 != 0){
            rev1 = rev1 * 10 + val1 % 10;
            val1 = val1/10;
        }
        
        while(val2 != 0){
            rev2 = rev2 * 10 + val2 % 10;
            val2 = val2/10;
        }
        //For each count of continous zeros, multiply the reversed value by 10
        for(int i = 0; i<count1; i++){
            rev1*=10;
        }
         for(int i = 0; i<count2; i++){
            rev2*=10;
        }
        long sum = rev1 + rev2;
        //If both lists only contain 0
        if(sum == 0){
            return temp;
        }
        
        while(sum != 0){
            l3.next = new ListNode((int)(sum % 10));
            l3 = l3.next;
            sum = sum /10;
        }

        return temp.next;
        
    }
}