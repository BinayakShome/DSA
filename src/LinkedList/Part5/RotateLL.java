package LinkedList.Part5;

public class RotateLL {
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }

    static Node rotate(Node head)
    {
        if (head == null || head.next == null) return head;

        Node pre = null;
        Node current = head;

        while (current.next!= null)
        {
            pre = current;
            current = current.next;
        }

        current.next = head;
        pre.next = null;

        return current;
    }

    static Node FinalRotate(Node head, int k)
    {
        for (int i = 0; i<k; i++)
        {
            head = rotate(head);
        }
        return head;
    }

    static void print(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String []args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.println("Original list");
        print(head);

        head = FinalRotate(head, k);
        print(head);
    }
}
