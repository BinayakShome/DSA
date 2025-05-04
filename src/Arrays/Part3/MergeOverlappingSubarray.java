package Arrays.Part3;
import java.util.*;

public class MergeOverlappingSubarray {
    static List<List<Integer>> merge(int nums[][])
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums, Comparator.comparingInt(a -> a[0]));

        for(int i = 0; i<n; i++)
        {
            if(ans.isEmpty() || nums[i][0] > ans.get(ans.size()-1).get(1))
            {
                ans.add(Arrays.asList(nums[i][0], nums[i][1]));
            }
            else
            {
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), nums[i][1]));
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[][] = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = merge(arr);
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
