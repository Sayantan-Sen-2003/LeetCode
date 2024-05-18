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
    int len1=0,len2=0;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        length(temp1,temp2);
        int diff=Math.abs(len1-len2);
        if(len1>=len2)
            return intersection( diff, temp1,temp2);//d =diff temp1=long list 
        else                                     //temp2=short list
            return intersection(diff,temp2,temp1);
            
    }
    public ListNode intersection(int d,ListNode headlong,ListNode headshort)
    {
        ListNode temp1=headlong;
        ListNode temp2=headshort;
        for(int i=0;i<d;i++){
            temp1=temp1.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
        
    }
    public void length(ListNode headA, ListNode headB){
        ListNode abc=headA;
         ListNode efg=headB;
        while(abc!=null){
            len1++;
            abc=abc.next;
        }
        while(efg!=null){
            len2++;
            efg=efg.next;
        }
    }
}