package Heap.part2;

import java.util.PriorityQueue;

public class kthSmallestElement {
    static int kthSmallest(int []nums, int k)
    {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pq.add(nums[i]);
        }

        int f = k - 1 ;

        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }

        return pq.peek();
    }
    public static void main(String []args)
    {
        int []arr = {1, 2, 6, 4, 5, 3};
        int n = 3;

        System.out.println(kthSmallest(arr, n));
    }
}
