package SlidingWindows_TwoPointers.Part1;

public class NumberofSubstringContainingThreeCharacters {

    static int numberOfSubstrings(String s)
    {
        int []count = new int[3];
        int res = 0, left = 0;

        for(int right = 0; right < s.length(); right++)
        {
            count[s.charAt(right) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0)
            {
                res += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return res;
    }
    public static void main(String []args)
    {
        String str = "abcabc";
        System.out.println(numberOfSubstrings(str));
    }
}
