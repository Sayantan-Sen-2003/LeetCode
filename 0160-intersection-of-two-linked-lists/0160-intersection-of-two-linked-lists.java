/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1,size2,diff;
        size1=length(headA);
        size2=length(headB);

        if(size1>size2){
            diff=size1-size2;
            return intersection(diff,headA,headB);
        }
        else{
            diff=size2-size1;
             return intersection(diff,headB,headA);
        }
    }
    int length(ListNode head){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    //head1>head2
    ListNode intersection(int diff,ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        for(int i=0;i<diff;i++){
                temp1=temp1.next;
        }
        while(temp1!=null &&temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return null;
    }
}