package Platform.LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOf1Bits {
    static int bit(int n)
    {
        Map<Character, Integer> map = new HashMap<>();
        String temp = Integer.toBinaryString(n);

        for(char c : temp.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.get('1');
    }
    public static void main(String []args)
    {
        int n = 128;
        System.out.print(bit(n));
    }
}
