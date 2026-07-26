class Solution {
    public List<List<Integer>> displayList(Node head) {

        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node temp = head;
        Node last = null;

        while (temp != null) {
            forward.add(temp.data);
            last = temp;
            temp = temp.next;
        }

        while (last != null) {
            backward.add(last.data);
            last = last.prev;
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(forward);
        ans.add(backward);

        return ans;
    }
}
