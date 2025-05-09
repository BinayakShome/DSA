package String.Part1;

public class RotateString {
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
    public static void main(String[] args)
    {
        System.out.println(rotateString("add", "add"));
    }
}
