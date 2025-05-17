package StackAndQueues.Part1;

public class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static Node pop(Node head) {
        if (head == null) {
            System.out.println("Stack Underflow");
            return null;
        }
        return head.next;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 5);

        System.out.println("Stack elements:");
        display(head);

        head = pop(head);
        System.out.println("After pop:");
        display(head);
    }
}
