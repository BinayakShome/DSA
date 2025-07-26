package SlidingWindows_TwoPointers.Part2;

public class LongestSubstringWithKdistinctCharacters {
    static int longest(String s, int k) {
        int n = s.length();
        if (n == 0 || k > n) return 0;

        int maxLen = 0;
        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {
            int[] count = new int[26];
            int left = 0, right = 0;
            int unique = 0;
            int countAtLeastK = 0;

            while (right < n) {
                if (unique <= uniqueTarget) {
                    int idx = s.charAt(right) - 'a';
                    if (count[idx] == 0) unique++;
                    count[idx]++;
                    if (count[idx] == k) countAtLeastK++;
                    right++;
                } else {
                    int idx = s.charAt(left) - 'a';
                    if (count[idx] == k) countAtLeastK--;
                    count[idx]--;
                    if (count[idx] == 0) unique--;
                    left++;
                }

                if (unique == uniqueTarget && unique == countAtLeastK) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }
        return maxLen;
    }
    public static void main(String []args)
    {
        String str = "aababbcaacc";
        int k = 2;
        System.out.println(longest(str,k));
    }
}
