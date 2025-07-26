package LeetCodeProblems;

public class ReverseStringIII {
    static String reverse(String s)
    {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
    public static void main(String []args)
    {
        String str = "Let's take LeetCode contest";
        System.out.println(reverse(str));
    }
}
