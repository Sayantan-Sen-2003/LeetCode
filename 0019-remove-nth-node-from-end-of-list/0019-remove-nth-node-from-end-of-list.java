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
        if(head==null)
        return head;

        ListNode fast=head;
        ListNode slow=head;
        ListNode current=null; //to track the previous step of slow pointer
        int count =0;

        while(count<n){
            fast=fast.next;
            count++;
        }
        if(fast==null)
        return head.next; //null

        while(fast!=null){
            current=slow;
            slow=slow.next;
            fast=fast.next;
        }
        // if(current.next!=null)
         current.next=current.next.next;
        //  else 
        //  current.next=null;
        return head;

    }
}