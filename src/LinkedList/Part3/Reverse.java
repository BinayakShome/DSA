package LinkedList.Part3;

public class Reverse {
    public class ListNode
    {
        int val;
        ListNode next;
    }
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode node = null;

        while(current != null)
        {
            ListNode temp = current.next;
            current.next = node;
            node = current;
            current = temp;
        }

        return node;
    }
}
