package LeetCodeProblems;

public class ValidWord {
    static boolean valid(String word)
    {
        if(word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(char c : word.toCharArray())
        {
            if(!Character.isLetterOrDigit(c)) return false;

            if(Character.isLetter(c))
            {
                char lower = Character.toLowerCase(c);
                if("aeiou".indexOf(lower) >= 0)
                {
                    hasVowel = true;
                }
                else
                {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }
    public static void main(String []args)
    {
        String word1 = "234Adas", word2 = "b3";
        System.out.println(valid(word1));
        System.out.println(valid(word2));
    }
}
