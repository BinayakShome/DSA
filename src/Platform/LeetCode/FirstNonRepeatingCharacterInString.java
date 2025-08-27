package Platform.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {
    static int firstUniq(String s)
    {
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        String s = "leetcode";
        System.out.println(firstUniq(s));
    }
}
