package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for (int j = 0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(char ch='A'; ch <= 'A'+i; ch++)
            {
                System.out.print(ch);
            }

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
//            for (int j = 0; j<n-i-1; j++)
//            {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
