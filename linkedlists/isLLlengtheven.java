class Solution {
    public boolean isEven(Node head) {
        // code here
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}
