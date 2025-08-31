package Platform.LeetCode.Medium;

public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode swapPairs(ListNode head)
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        while(head != null && head.next != null)
        {
            ListNode first = head;
            ListNode second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }
        return dummy.next;
    }

    public static void main(String []args)
    {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.print("Original List: ");
        printList(head);

        head = swapPairs(head);
        System.out.print("After Swap: ");
        printList(head);
    }
}
