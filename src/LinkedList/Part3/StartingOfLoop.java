package LinkedList.Part3;

public class StartingOfLoop {
    public class ListNode
    {
        int val;
        ListNode next;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                break;
            }
        }

        if(fast == null || fast.next == null)
        {
            return null;
        }
        fast = head;

        while(fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
