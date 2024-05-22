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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1= l1,temp2=l2;
        int carry=0;

        ListNode dummy= new ListNode(-17);
        ListNode head=dummy;
        while(temp1!=null || temp2!=null){
            int sum =0;
            if(temp1!=null) sum=sum+temp1.val;
            if(temp2!=null) sum=sum+temp2.val;

            sum=sum+carry;
            ListNode newnode = new ListNode(sum%10);
            dummy.next=newnode;
            dummy=newnode;
            carry=sum/10;

             if(temp1!=null) temp1=temp1.next;
             if(temp2!=null) temp2=temp2.next;
            }
            if(carry>0){
                ListNode newnode = new ListNode(carry);
                dummy.next=newnode;
                dummy=newnode;
            }
            return head.next ; //head points to the first dummy node ,we created
    }
}