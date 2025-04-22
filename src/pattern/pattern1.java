package pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int size = sc.nextInt();
        int num = 1;
        for(int i = 0; i<=size; i++)
        {
            for(int j = 0; j<i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}