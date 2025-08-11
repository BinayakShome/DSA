package LeetCodeProblems;

public class LengthOfLastWord {
    static int wordCount(String str)
    {
        int end = str.length() - 1;
        while(end >= 0 && str.charAt(end) == ' ')
        {
            end--;
        }
        int start = end;
        while(start >= 0 && str.charAt(start) != ' ')
        {
            start--;
        }
        return end - start;
    }
    public static void main(String []args)
    {
        String str = "   fly me   to   the moon  ";
        System.out.println(wordCount(str));
    }
}
