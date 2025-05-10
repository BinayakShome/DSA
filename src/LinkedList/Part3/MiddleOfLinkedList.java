package LinkedList.Part3;

import LinkedList.Part1_2.CreateLinkedList;

public class MiddleOfLinkedList {
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data)
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

    public Node middleElement()
    {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String [] args)
    {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Node middle = list.middleElement();
        System.out.println(middle.data);
    }
}
