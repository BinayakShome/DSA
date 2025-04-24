package Hashing;

import java.util.Scanner;

public class DeclaringHash {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Element ");
        for(int i = 0 ; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //precompute
        int hash[] = new int[13];
        for(int i = 0; i<n; i++)
        {
            hash[arr[i]] +=1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}
