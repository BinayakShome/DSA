package LinkedList.Part1_2;

import java.util.LinkedList;

public class Reverse_DLL {
    class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;

    public void reverse()
    {
        Node current = head;
        Node temp = null;

        while(current != null)
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if(temp != null)
        {
            head = temp.prev;
        }
    }

    public static void main(String[]args)
    {
        Reverse_DLL ls = new Reverse_DLL();
        ls.reverse();
    }
}

/// WRITE REST OF THE THINGS MANUALLY