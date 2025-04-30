package Basic;

import java.util.Stack;

public class MatchParenthesis {
    static boolean parenthesis(String data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]";
        boolean ans = parenthesis(str);
        System.out.println(ans ? "valid" : "not valid");
    }
}