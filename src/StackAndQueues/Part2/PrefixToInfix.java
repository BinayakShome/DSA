package StackAndQueues.Part2;

import java.util.Stack;

public class PrefixToInfix {
    static boolean isOperator(char c)
    {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    static String prefixToInfix(String exp)
    {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--)
        {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
            {
                stack.push(c+ "");
            }
            else if (isOperator(c)) {
                if (stack.size() < 2) return "Invalid Expression";

                String op1 = stack.pop();
                String op2 = stack.pop();

                String res = "(" + op1 + c + op2 + ")";
                stack.push(res);
            }
        }
        if (stack.size() != 1) return "Invalid Expression";
        return stack.pop();
    }
    public static void main(String []args)
    {
        String exp = "*+AB-CD";
        System.out.println("Prefix: " + exp);
        System.out.println("Infix: "+prefixToInfix(exp));
    }
}
