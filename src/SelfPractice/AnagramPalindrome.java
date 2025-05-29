package SelfPractice;

import java.util.HashMap;
import java.util.Map;

public class AnagramPalindrome {
    static int ap(String s)
    {
        Map<Character,Integer> map = new HashMap<>();

        //count frequency
        for (char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int oddcount = 0;

        for (int count : map.values())
        {
            if(count % 2 != 0)
            {
                oddcount++;
            }
        }

        // For palindrome, oddCount must be <= 1
        return (oddcount <= 1) ? 1 : 0;
    }
    public static void main(String []args)
    {
        String str = "geeksogeeks";
        System.out.println(ap(str));
    }
}
