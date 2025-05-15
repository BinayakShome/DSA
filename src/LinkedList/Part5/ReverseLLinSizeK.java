package LinkedList.Part5;

public class ReverseLLinSizeK {
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

    static Node reverse(Node head, int k)
    {
        if (head == null || k == 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node current = dummy, nex, pre = dummy;

        int count = 0;

        //count number of nodes
        while ( current != null)
        {
            current = current.next;
            count++;
        }

        while (count >= k)
        {
            current = pre.next;
            nex = current.next;

            for (int i = 0; i < k-1 ; i++)
            {
                if (nex == null) break; // Avoids null pointer exception
                current.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = current.next;
            }
            pre = current;
            count -= k;
        }

        return dummy.next;
    }

    static void print(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data+" - > ");
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
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);

        int k = 3;
        System.out.println("Original list");
        print(head);

        System.out.println("Reversed List");
        Node reversed = reverse(head,k);
        print(reversed);
    }
}
