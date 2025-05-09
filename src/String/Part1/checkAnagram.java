package String.Part1;

public class checkAnagram {
    static boolean checkAnagrams(String str1, String str2) {
        //str1 = str1.toLowerCase();
        //str2 = str2.toLowerCase();
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String []args)
    {
        System.out.println(checkAnagrams("run","urn"));
    }
}
