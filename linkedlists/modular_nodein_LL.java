class Solution {
    public int modularNode(Node head, int k) {
        // code here
    int pos = 1;
    int ans = -1;

    while (head != null) {
        if (pos % k == 0) {
            ans = head.data;
        }
        pos++;
        head = head.next;
    }

    return ans;

        }
}
