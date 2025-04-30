package Arrays.Part1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    static void removeDuplicates(int nums[]) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            System.out.print(num + "  ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {6, 3, 9, 2, 9, 4, 3, 2};
        removeDuplicates(nums);
    }
}