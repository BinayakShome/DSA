package SlidingWindows_TwoPointers.Part1;

import java.util.*;

public class FruitBasket {
    static int fruitBasket(int []arr)
    {
        int n = arr.length;
        int left = 0;
        int maxlen = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++)
        {
            //Add the current element to the map
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);

            //if we have more than 2 elements, shrink the map from left
            while(map.size() > 2)
            {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
    public static void main(String []args)
    {
        int []arr = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(fruitBasket(arr));
    }
}
