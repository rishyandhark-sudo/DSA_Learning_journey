class Solution {
    public Node insertInMiddle(Node head, int x) {

        Node n = new Node(x);

        if(head == null)
            return n;

        int c = 0;
        Node temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }

        temp = head;

        for(int i = 0; i < (c - 1) / 2; i++){
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;

        return head;
    }
}
