class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        Node temp=head;
        ArrayList<Integer> arr = new ArrayList<>();
        do{
            arr.add(temp.data);
            temp=temp.next;
        }while(temp!=null);
        return arr;
    }
}
