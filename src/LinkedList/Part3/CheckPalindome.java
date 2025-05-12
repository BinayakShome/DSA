package LinkedList.Part3;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindome {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean isPalindrome(Node head)
    {
        List<Integer> list = new ArrayList<>();

        while(head != null)
        {
            list.add(head.data);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while(left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }

    public static void main(String []args)
    {

    }
}
