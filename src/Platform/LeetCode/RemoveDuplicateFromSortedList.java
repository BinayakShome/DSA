package Platform.LeetCode;

public class RemoveDuplicateFromSortedList {
    static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ptr = head;

        while(ptr != null && ptr.next != null)
        {
            if(ptr.val == ptr.next.val)
            {
                ptr.next = ptr.next.next;
            }else{
                ptr = ptr.next;
            }
        }
        return head;
    }

    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String []args)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);

        head = deleteDuplicates(head);
        printList(head);
    }
}

