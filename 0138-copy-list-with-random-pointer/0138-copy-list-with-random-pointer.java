/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        insert(head);
        connectRandomPointers(head);
        return copiedList(head);
    }

    //1 copy the newnodes in between
    void insert(Node head){
        Node temp=head;
        while(temp!=null){
            Node newnode= new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;//since it is temp--> copynode--> []--> []
        }
    }
    //2 connect random pointers
    void connectRandomPointers(Node head){
        Node temp=head;
        while(temp!=null){
            Node copynode= temp.next;

            if(temp.random!=null)
            copynode.random= temp.random.next;
            else
             copynode.random= null;

            temp=temp.next.next;
        }
    }

    //3 arrange the nexts for both set of nodes and return the copied list
    Node copiedList(Node head){
        Node dummy=new Node(-1);
        Node res=dummy, temp=head;
        while(temp!=null){
            res.next= temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dummy.next;
    }

}