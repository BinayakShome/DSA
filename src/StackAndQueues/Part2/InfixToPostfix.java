package StackAndQueues.Part2;

import java.util.Stack;

public class InfixToPostfix {
    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            // Left parenthesis
            else if (c == '(') {
                stack.push(c);
            }

            // Right parenthesis
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression"; // Invalid expression
                } else {
                    stack.pop();
                }
            }

            // Operator
            else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression";
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + infixToPostfix(exp));
    }
}
