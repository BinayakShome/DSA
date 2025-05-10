package LinkedList.Part1_2;

public class DoubleLinkedList {
    class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    // ADD FIRST
    public void addfirst(int value)
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // ADD LAST
    public void addLast(int value)
    {
        Node newNode = new Node(value);

        if (head == null)
        {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    //Delete first
    public void deletefirst()
    {
        if (head == null)
        {
            return;
        }

        head = head.next;
        head.next.prev = null;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next.prev = null;
        current.next = null;
    }


    //Display and count elements
    public void countAndDisplay()
    {
        Node currentNode = head;
        int count = 0;

        while(currentNode != null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
            count++;
        }
        System.out.println("null");
        System.out.println(count);
    }
    public static void main(String []args)
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.countAndDisplay();
        list.deletefirst();
        list.countAndDisplay();
        list.deleteLast();
        list.countAndDisplay();
    }
}
