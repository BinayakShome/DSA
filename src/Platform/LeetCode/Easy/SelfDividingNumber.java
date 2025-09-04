package Platform.LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    static List<Integer> dividing(int left, int right)
    {
        List<Integer> ans = new ArrayList<>();

        for(int i = left; i <= right; i++)
        {
            if(isSelfDividing(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }

    static boolean isSelfDividing(int num)
    {
        int temp = num;
        while(temp > 0)
        {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String []args)
    {
        int left = 1, right = 22;
        System.out.print(dividing(left, right));
    }
}
