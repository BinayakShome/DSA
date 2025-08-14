package LeetCodeProblems;

public class Largest3SameDigitNumberInAString {
    static String largestGoodInteger(String num)
    {
        String ans = "";
        for (int i = 0; i < num.length() - 2; i++)
        {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2))
            {
                String triple = num.substring(i, i + 3);
                if (ans.isEmpty() || triple.compareTo(ans) > 0)
                {
                    ans = triple;
                }
            }
        }
        return ans;
    }

    public static void main(String []args)
    {
        String num = "42352338";
        System.out.println(largestGoodInteger(num));
    }
}
