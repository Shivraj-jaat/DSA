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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;


     
        while(list1 != null || list2 != null ){
                ListNode curr = new ListNode(-1);
                ListNode curr1 = new ListNode(-1);
                int val1 = Integer.MAX_VALUE;
                int val2 = Integer.MAX_VALUE;

            if(list1 != null){
              val1 = list1.val;
              curr = new ListNode(val1);
            }

             if(list2 != null){
               val2 = list2.val;
               curr1 = new ListNode(val2);
            }

            if(val1 <= val2){
                temp.next = curr;
                list1 = list1.next;
                temp = temp.next;
            }
            else{
                temp.next = curr1;
                list2 = list2.next;
                temp = temp.next;
            }

        }
        return dummy.next;
    }
}