package Heap.Extra;

import java.util.PriorityQueue;

public class AddingArrayElementsinHeap {
    static int opr(int []arr, int n, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int x : arr) minHeap.add(x);

        int operations = 0;
        while(!minHeap.isEmpty() && minHeap.peek() < k)
        {
            if (minHeap.size() < 2) return -1;

            int first = minHeap.poll();
            int second = minHeap.poll();

            int newElement = first + second;

            minHeap.add(newElement);
            operations++;
        }
        return operations;
    }
    public static void main(String []args)
    {
        int []arr = {1, 10, 12, 9, 2, 3};
        int n = arr.length;
        int k = 6;

        System.out.println(opr(arr, n, k));
    }
}
