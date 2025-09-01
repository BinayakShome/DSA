package Platform.LeetCode.Easy;

import java.util.Stack;

public class BackSpaceStringCompare {
    static boolean backspaceCompare(String s, String t)
    {
        return build(s).equals(build(t));
    }
    static String build(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray())
        {
            if(ch == '#')
            {
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(ch);
            }
        }
        return String.valueOf(stack);
    }
    public static void main(String []args)
    {
        String s = "ab#c";
        String t = "ad#c";
        System.out.print(backspaceCompare(s, t));
    }
}
