package String.Part2;

public class BeautySum {
    public static int beautySum(String s) {
        int totalBeauty = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // frequency map

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }

    public static void main(String[] args) {
        String input = "aabcb";
        System.out.println(beautySum(input));  // Output: 5
    }
}
