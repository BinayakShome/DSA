package GreedyAlgorithm.Part1;

public class ValidParenthesisString {
    static boolean valid(String s)
    {
        int low = 0;
        int high = 0;
        for(int ch : s.toCharArray())
        {
            if( ch == '(')
            {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else if (ch == '*') {
                low--;
                high++;
            }

            if(high < 0) return false;

            if(low < 0) low = 0;
        }
        return low == 0;
    }
    public static void main(String []args)
    {
        String str = "(*))";
        System.out.println(valid(str));
    }
}
