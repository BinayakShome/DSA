package String.Part2;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static int convert(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;
        int preValue = 0;

        for (int i = s.length() - 1; i>=0; i--)
        {
            int current = map.get(s.charAt(i));

            if (current < preValue)
            {
                total = total - current;
            }
            else
            {
                total = total + current;
            }

            preValue = current;
        }

        return total;
    }

    public static void main(String []args)
    {
        String num = "MCMXCIV";
        System.out.println(convert(num));
    }
}
