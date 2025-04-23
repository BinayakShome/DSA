package pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++)
        {
            //space
            for (int j = 0; j<num-i-1; j++)
            {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j<i*2+1; j++)
            {
                System.out.print("*");
            }

            //space
            for (int j = 0; j<num-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
