package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LuckyNumberInArray {
    static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int lucky = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                lucky = Math.max(lucky, entry.getKey());
            }
        }
        return lucky;
    }

    public static void main(String []args)
    {
        int []arr = {1,2,2,3,3,3};
        System.out.print(findLucky(arr));
    }
}
