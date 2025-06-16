package SlidingWindows_TwoPointers.Extra;

public class ReverseVowels {
    static String reverseVowels(String s) {
        // Convert to char array since Strings are immutable
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;

        while (l < r) {
            // Move left pointer if not vowel
            if (!isVowel(chars[l])) {
                l++;
                continue;
            }

            // Move right pointer if not vowel
            if (!isVowel(chars[r])) {
                r--;
                continue;
            }

            // Both are vowels — swap them
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }

        return new String(chars);
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println("Original: " + s1 + " -> Reversed Vowels: " + reverseVowels(s1));
        System.out.println("Original: " + s2 + " -> Reversed Vowels: " + reverseVowels(s2));
    }
}
