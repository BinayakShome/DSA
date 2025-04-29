package Hashing;

import java.util.HashSet;

public class UnionArrays {
    static void union(int num1[], int num2[])
    {
        int n1 = num1.length, n2 = num2.length;
        HashSet<Integer> set = new HashSet<>();

        //for 1st array
        for(int i = 0; i<n1; i++)
        {
            set.add(num1[i]);
        }

        //for 2nd array
        for(int i = 0; i<n2; i++)
        {
            set.add(num2[i]);
        }

        for(int key: set)
        {
            System.out.print(key+"  ");
        }
    }

    public static void main(String[] args)
    {
        int num1[] = {7,3,9};
        int num2[] = {6,3,9,2,9,4};
        union(num1, num2);
    }
}