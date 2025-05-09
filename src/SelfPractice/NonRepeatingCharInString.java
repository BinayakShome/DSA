package SelfPractice;

public class NonRepeatingCharInString {
    static int nonRepeatingChar(String s)
    {
        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i<n; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i<n; i++)
        {
            if (freq[s.charAt(i) - 'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String str = "aabb";
        System.out.println(nonRepeatingChar(str));
    }
}

///O(n)
///output: 0