package SelfPractice;

import java.util.*;

//No char should appear twice
public class CheckIsogram {
    static boolean isogram(String str)
    {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray())
        {
            if(set.contains(c))
            {
                return false;
            }
            set.add(c);
        }
        return true;
    }
    public static void main(String []args)
    {
        String str = "machine";
        System.out.println(isogram(str));
    }
}
