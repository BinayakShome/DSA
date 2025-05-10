package String.Part2;

public class MaxDepth {
    static int depth(String s)
    {
        int currentDepth = 0;
        int maxDepth = 0;

        for (int c : s.toCharArray())
        {
            if (c == '(')
            {
                currentDepth++;
                maxDepth = Math.max(maxDepth,currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
    public static void main(String []args)
    {
        String input = "(1+(2*3)+((8)/4))+1";
        System.out.println(depth(input));
    }
}

/// MAXIMUM NESTING DEPTH OF PARENTHESES