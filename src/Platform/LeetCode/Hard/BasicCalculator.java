package Platform.LeetCode.Hard;

import java.util.Stack;

public class BasicCalculator {
    static int calc(String s)
    {
        int result = 0;
        int sign = 1; // 1 -> +ve,  0 -> -ve
        int num = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // build multi-digit number
            }
            else if (ch == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            }
            else if (ch == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            }
            else if (ch == '(') {
                // push current result and sign
                stack.push(result);
                stack.push(sign);
                // reset for inner expression
                result = 0;
                sign = 1;
            }
            else if (ch == ')') {
                result += sign * num; // add last number
                num = 0;

                result *= stack.pop(); // multiply by sign before '('
                result += stack.pop(); // add result before '('
            }
            // spaces are ignored
        }

        if (num != 0) result += sign * num; // add last number
        return result;
    }
    public static void main(String []args)
    {
        String s = "1 + 1";
        System.out.println(calc(s));
    }
}
