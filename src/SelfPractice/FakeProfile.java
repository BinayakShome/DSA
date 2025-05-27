package SelfPractice;

import java.util.HashSet;

public class FakeProfile {
    static String detector(String a)
    {
        HashSet<Character> set =new HashSet<>();

        for(char c : a.toCharArray())
        {
            if ("aeiou".indexOf(c) == -1)
            {
                set.add(c);
            }
        }

        if(set.size() % 2 != 0)
        {
            return "HE";
        }
        else {
            return "SHE";
        }
    }
    public static void main(String []args)
    {
        String username = "plkaitw";
        System.out.println(detector(username));
    }
}
