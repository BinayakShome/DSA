package Arrays.Part2;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySum {
    static int count(int nums[], int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0,1);
        for(int i = 0; i<n; i++)
        {
            preSum += nums[i];
            int remove = preSum - k;
            cnt = cnt + mpp.getOrDefault(remove,0);
            mpp.put(preSum, mpp.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.print(count(arr,k));
    }
}

//Brute force
//static void count(int nums[], int k) {
//    int n = nums.length;
//    int count = 0;
//
//    for (int i = 0; i < n; i++) {
//        int sum = 0;
//        for (int j = i; j < n; j++) {
//            sum += nums[j];
//            if (sum == k) {
//                count++;
//            }
//        }
//    }
//    System.out.print(count);
//}