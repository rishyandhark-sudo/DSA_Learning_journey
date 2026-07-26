class Solution {
    public static int getLength(Node head) {
        // code here
        Node temp=head;
        int c=1;
        temp=temp.next;
        while(temp!=head){
            temp=temp.next;
            c++;
        }
        return c;
    }
}
