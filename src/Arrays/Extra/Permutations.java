package Arrays.Extra;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<List<Integer>> permut(int []arr)
    {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), new boolean[arr.length], ans);
        return ans;
    }

    static void backtrack(int []nums, List<Integer> curr, boolean[] used, List<List<Integer>> result)
    {
        if(curr.size() == nums.length)
        {
            if(!result.contains(curr))
            {
            result.add(new ArrayList<>(curr));
            return;
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(used[i]) continue;

            curr.add(nums[i]);
            used[i] = true;

            backtrack(nums, curr, used, result);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String []args)
    {
        int []arr = {1, 1, 2};
        System.out.println(permut(arr));
    }
}
