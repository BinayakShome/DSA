package LinkedList.Part3;

public class LengthOfLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Function to detect loop and return its length
    public static int findLoopLength(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        // No loop
        return 0;
    }

    // Helper method to count the number of nodes in the loop
    private static int countLoopLength(Node loopNode) {
        Node temp = loopNode;
        int count = 1;

        while (temp.next != loopNode) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        int loopLength = findLoopLength(head);
        if (loopLength > 0) {
            System.out.println("Loop detected! Length of loop: " + loopLength);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
