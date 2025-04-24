package Hashing;

import java.util.Scanner;

public class CharacterHashing1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text in lowercase only");
        String s = sc.nextLine();

        int hash[] = new int[26];

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            hash[ch - 'a']++;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (hash[c - 'a'] > 0) {
                System.out.println(c + ": " + hash[c - 'a']);
            }
        }
    }
}
