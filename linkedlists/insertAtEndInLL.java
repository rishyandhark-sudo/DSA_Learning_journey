class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node n=new Node(x);
        if(head==null){
            head=n;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return head;
    }
}
