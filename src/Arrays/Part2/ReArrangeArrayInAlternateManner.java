package Arrays.Part2;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeArrayInAlternateManner {

    static int rearrange(int nums[])
    {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int key: nums)
        {
            if(key>0)
            {
                pos.add(key);
            } else if (key < 0) {
                neg.add(key);
            }
        }

        int i = 0, p = 0, ne = 0;
        while (p < pos.size() && ne < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(ne++);
        }

        while (p < pos.size()) {
            nums[i++] = pos.get(p++);
        }

        while (ne < neg.size()) {
            nums[i++] = neg.get(ne++);
        }

        return nums[0];
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,-3,-1,-2,-3};
        rearrange(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}

// i%2==0 --> +ve
// i%2!=0 --> -ve