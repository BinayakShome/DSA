package LinkedList.Extra;

public class CreateLinkedList {
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    //Add first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add at last
    public void addlast(String data)
    {
        Node newNode = new Node(data);

        if (head==null)
        {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    //DELETE FIRST
    public void deletefirst()
    {
        if (head == null)
        {
            return;
        }
        head = head.next;
    }

    public void deletelast()
    {
        if (head == null)
        {
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        if (head.next ==null)
        {
            head = null;
            return;
        }
        while(last.next != null)
        {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    // DISPLAY LIST
    public void display()
    {
        Node currentNode = head;
        int count = 0;
        while(currentNode != null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
            count++;   /// ----> FOR DISPLAYING THE SIZE OF LINKEDLIST
        }
        System.out.println("NULL");
        System.out.println(count);
    }
    public static void main(String []args)
    {
        CreateLinkedList list = new CreateLinkedList();
        list.addFirst("World");
        list.addFirst("Hello");
        list.addlast("wow");
        list.display();
        list.deletefirst();
        list.display();
        list.deletelast();
        list.display();
        list.deletelast();
        list.display();
    }
}
