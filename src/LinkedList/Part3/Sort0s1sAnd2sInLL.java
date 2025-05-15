package LinkedList.Part3;

public class Sort0s1sAnd2sInLL {
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

    static void sort(Node head)
    {
        int count[] = {0,0,0};

        Node temp = head;

        while (temp != null)
        {
            count[temp.data]++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;

        while (temp != null)
        {
            if(count[i] == 0)
            {
                i++;
            }
            else
            {
                temp.data = i;
                count[i]--;
                temp = temp.next;
            }
        }
    }

    static void print(Node head)
    {
        while(head != null)
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
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        System.out.println("Original list");
        print(head);

        sort(head);
        System.out.println("Sorted list");
        print(head);
    }
}