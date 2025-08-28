package Platform.LeetCode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    static int[] topElements(int[] nums, int k)
    {
        int [] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
    public static void main(String []args)
    {
        int []nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        System.out.println(Arrays.toString(topElements(nums, k)));
    }
}
