package Platform.LeetCode;

import java.util.HashMap;

public class SubArraysWithKDifferentIntegers {
    static int atMostK(int []arr, int k)
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, res = 0;
        for(int right = 0; right < n; right++)
        {
            int num = arr[right];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while(map.size() > k)
            {
                int leftNum = arr[left];
                map.put(leftNum, map.get(leftNum) - 1);
                if(map.get(leftNum) == 0)
                {
                    map.remove(leftNum);
                }
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }
    static int numberOfSubArrays(int []arr, int k)
    {
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }
    public static void main(String []args)
    {
        int []arr = {1,2,1,2,3};
        int k = 2;
        System.out.println(numberOfSubArrays(arr, k));
    }
}
