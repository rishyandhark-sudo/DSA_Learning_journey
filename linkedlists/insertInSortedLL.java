
class Solution {
    Node sortedInsert(Node head, int key) {
        Node n = new Node(key);

        // Empty list or insert at beginning
        if (head == null || key <= head.data) {
            n.next = head;
            return n;
        }

        Node temp = head;

        // Find the correct position
        while (temp.next != null && temp.next.data < key) {
            temp = temp.next;
        }

        // Insert node
        n.next = temp.next;
        temp.next = n;

        return head;
    }
}
