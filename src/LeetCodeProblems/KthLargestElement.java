package LeetCodeProblems;

import java.util.PriorityQueue;

public class KthLargestElement {
    static int kthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.offer(nums[i]);
        }
        for(int i=k; i<nums.length; i++){
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args)
    {
        int []arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargest(arr,k));
    }
}
