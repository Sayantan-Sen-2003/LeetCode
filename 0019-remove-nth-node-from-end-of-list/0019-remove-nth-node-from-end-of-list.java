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

        ListNode fast=head,slow=head,current=null;
        int count=0;

        while(count<n){
            count++;
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        } 
        while(fast!=null){
            current=slow;
            fast=fast.next;
            slow=slow.next;
        }
        current.next=current.next.next;

        return head;
    }
}