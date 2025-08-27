package Platform.LeetCode.Easy;

public class BinaryNumbersInLinkedlistToIntegers {
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

    static int getDecimal(Node head)
    {
        int result = 0;
        while(head != null)
        {
            result = (result << 1) | head.data; //Left shift and add the bit
            head = head.next;
        }
        return result;
    }
    public static void main(String []args)
    {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);

        int decimal = getDecimal(head);
        System.out.println(decimal);
    }
}
