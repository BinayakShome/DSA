package SelfPractice;

import java.util.ArrayList;

public class UniqueNumber {
    static ArrayList<Integer> uniqueNumbers(int L, int R) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num = L; num <= R; num++) {
            if (hasAllUniqueDigits(num)) {
                result.add(num);
            }
        }

        return result;
    }

    static boolean hasAllUniqueDigits(int num) {
        boolean[] seen = new boolean[10]; // digits 0 to 9

        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) return false;
            seen[digit] = true;
            num /= 10;
        }

        return true;
    }
    public static void main(String []args)
    {
        int L = 10;
        int R = 20;

        ArrayList<Integer> result = uniqueNumbers(L, R);
        System.out.println(result);
    }
}
