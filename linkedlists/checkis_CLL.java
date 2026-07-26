class Solution {
    boolean isCircular(Node head) {
        // code here
        Node temp=head;
        Node temp1=head;
        boolean is = true;
        while(is){
            temp=temp.next;
            if(temp==null){
                is=false;
                return is;
            }
            if(temp==temp1){
                return true;
            }
        }
        return is;
    }
}
