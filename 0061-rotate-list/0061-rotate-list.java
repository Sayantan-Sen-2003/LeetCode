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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        return head;
        ListNode tail = head;
        int count=1;
        while(tail.next!=null){
                tail=tail.next;
                count++; //gets the length of the linked list 
        }
        if(k%count==0)return head;

        k=k%count;
        int newlen= count-k;
        ListNode temp= head;
        for(int i=0;i<newlen-1;i++){
            temp=temp.next;
        }
        tail.next=head;
        head=temp.next;
        temp.next=null;


        return head;
    }
}