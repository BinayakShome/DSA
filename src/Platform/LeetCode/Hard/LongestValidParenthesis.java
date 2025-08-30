package Platform.LeetCode.Hard;

import java.util.Stack;

public class LongestValidParenthesis {
    static int maximumLength(String s)
    {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
    public static void main(String []args)
    {
        String s = "(()";
        System.out.print(maximumLength(s));
    }
}
