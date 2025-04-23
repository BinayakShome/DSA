package pattern;

import java.util.Scanner;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++)
        {
            // Ascending numbers
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }
}