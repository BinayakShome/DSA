package Hashing;

import java.util.Scanner;

public class CharacterHashing2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();

        int hash[] = new int[256];
        for(int i = 0; i<s.length(); i++)
        {
            hash[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (hash[i] > 0) {
                System.out.println("'" + (char)i + "': " + hash[i]);
            }
        }
    }
}