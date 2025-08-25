package Arrays.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void backTrack(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> ans)
    {
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0)
        {
            return;
        }

        for(int i = start; i < candidates.length; i++)
        {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            curr.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i + 1, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String []args)
    {
        int []candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }
}
