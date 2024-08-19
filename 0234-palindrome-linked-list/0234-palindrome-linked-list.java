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
    //find middle
    //reverse from mid or mid+1 to end
    //compare from ...
    public boolean isPalindrome(ListNode head) {
        ListNode mid= middle(head); //o(n/2)
        ListNode last= reverse(mid); //o(n/2)
         ListNode lastP= last;

        ListNode current=head;

        while(last!=null){         //o(n/2)
            if(current.val!=last.val){
                reverse(lastP);    //o(n/2)
                return false;
            }
            else{
                current=current.next;
                last=last.next;
            }
        }
        reverse(lastP);      //o(n/2)
        return true;
    }
    ListNode middle(ListNode head){
        ListNode slow= head;
        ListNode fast= head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==null){
            return slow;
        }
        else{
            return slow.next;
        }
    }
    ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null,front=null;
        //_ _ _
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

}