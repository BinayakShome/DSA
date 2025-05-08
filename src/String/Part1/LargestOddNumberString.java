package String.Part1;

public class LargestOddNumberString {
    static String oddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "52";
        System.out.println(oddNumber(num)); // Output: "5"
    }
}