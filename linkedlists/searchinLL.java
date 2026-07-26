class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
         Boolean isFound=false;
        Node temp=head;
        do{
            if(key==temp.data){
                isFound=true;
                
            }
            temp=temp.next;
        }while(temp!=null);
        return isFound;
    }
}
