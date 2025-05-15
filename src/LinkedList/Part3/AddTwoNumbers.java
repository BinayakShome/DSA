package LinkedList.Part3;

public class AddTwoNumbers {
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

    static Node add(Node l1, Node l2)
    {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
            int val1 = (l1 != null) ? l1.data : 0;
            int val2 = (l2 != null) ? l2.data : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new Node(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    static void print(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        //num1   ---> 243
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        //num2  ---> 564
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = add(l1, l2);
        print(result);
    }
}
