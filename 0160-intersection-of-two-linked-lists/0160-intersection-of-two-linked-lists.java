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
        ListNode current= headA;

        while(current!=null){
          ListNode abc= search(headB,current);
          if(abc==null){
            current=current.next;
          }
          else
          return abc;
        }
        return null;
    }

    public ListNode search(ListNode headB,ListNode toSearch){
            ListNode temp=headB;
            while(temp!=null){
                if(temp==toSearch)
                return temp;
                else
                temp=temp.next;
            }
            return null;
    }
}