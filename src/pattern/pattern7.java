package pattern;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
             {
                for (int j = 0; j < n; j++) {
                    if((i+j)%2!=0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
