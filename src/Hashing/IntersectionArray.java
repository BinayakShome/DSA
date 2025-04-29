package Hashing;

import java.util.HashSet;

public class IntersectionArray {
    static void intersection(int num1[], int num2[]) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int num : num1) {
            set1.add(num);
        }
        for (int num : num2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        for (int key : intersectionSet) {
            System.out.print(key + "  ");
        }
    }

    public static void main(String[] args) {
        int num1[] = {7, 3, 9, 6};
        int num2[] = {6, 3, 9, 2, 9, 4};
        intersection(num1, num2);
    }
}