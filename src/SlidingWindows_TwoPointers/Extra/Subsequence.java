package SlidingWindows_TwoPointers.Extra;

public class Subsequence {
    static boolean isSubsequence(String s, String t)
    {
        char []ch1 = t.toCharArray();
        char []ch2 = s.toCharArray();
        int m1 = 0, m2 = 0;

        while (m1 < ch1.length && m2 < ch2.length) {
            if (ch2[m2] == ch1[m1]) {
                m2++;
            }
            m1++;
        }

        return m2 == ch2.length;
    }
    public static void main(String []args)
    {
        String t = "ahbgdc";
        String s = "abc";
        System.out.println(isSubsequence(s, t));
    }
}
