package Platform.LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    static char difference(String s, String t)
    {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        return (char) count.keySet().toArray()[0];
    }
    public static void main(String []args)
    {
        String s = "";
        String t = "y";
        System.out.print(difference(s, t));
    }
}
