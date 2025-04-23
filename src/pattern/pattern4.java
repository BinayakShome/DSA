package pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // Upper half
        for(int i = 0; i < n; i++)
        {
            // spaces
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n - 2; i >= 0; i--)
        {
            // spaces
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
