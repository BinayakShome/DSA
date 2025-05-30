package SlidingWindows_TwoPointers.Part1;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    static int substring(String str)
    {
        int len = 0;
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;

        while(right<n)
        {
            if(map.containsKey(str.charAt(right)))
            {
                left = Math.max(map.get(str.charAt(right))+1, left);
            }
            map.put(str.charAt(right), right);
            len = Math.max(len, right - left +1);
            right++;
        }
        return len;
    }

    public static void main(String[] args)
    {
        String str = "binayak";
        System.out.print(substring(str));
    }
}
