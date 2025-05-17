package StackAndQueues.Part1;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add to the end of the queue
    static Node enqueue(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    // Remove from the front of the queue
    static Node dequeue(Node head) {
        if (head == null) {
            System.out.println("Underflow");
            return null;
        }
        return head.next;
    }

    // Print the queue
    static void display(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        // Enqueue elements
        head = enqueue(head, 10);
        head = enqueue(head, 20);
        head = enqueue(head, 30);

        System.out.println("Queue elements:");
        display(head);

        // Dequeue an element
        head = dequeue(head);

        System.out.println("After one dequeue:");
        display(head);
    }
}
