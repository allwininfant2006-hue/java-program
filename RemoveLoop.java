class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class LinkedListUtils {
    public static void detectAndRemoveLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // 1. Detect if a loop exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Loop detected
            }
        }

        // 2. If loop exists, find the start of the loop and break it
        if (slow == fast) {
            slow = head;
            // If they met at the head, find the last node of the loop
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                // Move both pointers at the same speed until they meet
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            // Break the link to remove the loop
            fast.next = null; 
        }
    }
}
