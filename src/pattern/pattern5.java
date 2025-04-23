package pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>0; i--)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
