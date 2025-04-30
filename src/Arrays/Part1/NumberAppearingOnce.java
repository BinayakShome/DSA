package Arrays.Part1;

import java.util.HashMap;

public class NumberAppearingOnce {
    static int findnumber(int nums[])
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for(int key: map.keySet())
        {
            if(map.get(key)==1)
            {
                System.out.print(key+"  ");
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 1, 2, 1, 2};
        findnumber(arr);
    }
}

//find number appearing once

//using XOR operation
//public class NumberAppearingOnce {
//    public static void main(String[] args) {
//        int[] arr = {4, 1, 2, 1, 2};
//        int result = 0;
//        for (int num : arr) {
//            result ^= num;
//        }
//        System.out.println(result);
//    }
//}
