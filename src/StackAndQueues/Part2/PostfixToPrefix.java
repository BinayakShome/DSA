package StackAndQueues.Part2;

import java.util.Stack;

public class PostfixToPrefix {
    static boolean isOperator(char c)
    {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    static String postfixToPrefix(String exp)
    {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else if (isOperator(c)) {
                if (stack.size() < 2) return "Invalid Expression";
                String op2 = stack.pop();
                String op1 = stack.pop();

                String expr = c + op1 + op2;
                stack.push(expr);
            }
        }
        return (stack.size() == 1) ? stack.pop() : "Invalid Expression";
    }
    public static void main(String []args)
    {
        String exp = "AB+CD-*";
        System.out.println("Postfix: "+exp);
        System.out.println("Prefix: "+postfixToPrefix(exp));
    }
}