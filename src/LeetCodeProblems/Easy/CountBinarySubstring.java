package LeetCodeProblems.Easy;

public class CountBinarySubstring {
    static int countBinarySubstrings(String s)
    {
        int prev = 0, current = 1, count = 0;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
            {
                current++;
            }else
            {
                count += Math.min(prev, current);
                prev = current;
                current = 1;
            }
        }
        count += Math.min(prev, current);
        return count;
    }
    public static void main(String []args)
    {
        String str = "00110011";
        System.out.println(countBinarySubstrings(str));
    }
}
