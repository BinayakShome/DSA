package StackAndQueues.Part2;

import java.util.Stack;

public class PrefixToPostfix {
    static boolean isOperator(char c)
    {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    static String prefixTopostfix(String exp)
    {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i>=0; i--)
        {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
            {
                stack.push(c+"");
            } else if (isOperator(c)) {
                if (stack.size() < 2)
                {
                    return "Invalid expression";
                }

                String op1 = stack.pop();
                String op2 = stack.pop();

                String expr = op1+op2+c;
                stack.push(expr);
            }
        }
        return (stack.size() == 1) ? stack.pop() : "Invalid Expression";
    }
    public static void main(String []args)
    {
        String exp = "*+AB-CD";
        System.out.println("Prefix: "+exp);
        System.out.println("Postfix: "+prefixTopostfix(exp));
    }
}
