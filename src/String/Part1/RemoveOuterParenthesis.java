package String.Part1;

public class RemoveOuterParenthesis {
    static String remove(String s)
    {
        StringBuilder result = new StringBuilder();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opened > 0) {
                    result.append(c);
                }
                opened++;
            } else if (c == ')') {
                opened--;
                if (opened > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
    public static void main(String []args)
    {
        String str = "(()())(())";
        System.out.println(remove(str));
    }
}
