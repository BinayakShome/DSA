package LinkedList.Part3;

public class DeleteMiddleElement {
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteMiddle(Node head)
    {
        if(head == null || head.next == null) return null;

        Node fast = head;
        Node slow = head;
        Node prev = null;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

        return head;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String []args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //head.next.next.next.next = new Node(5);

        head = deleteMiddle(head);
        printList(head);
    }
}