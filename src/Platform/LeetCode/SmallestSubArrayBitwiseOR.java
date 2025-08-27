package Platform.LeetCode;

public class SmallestSubArrayBitwiseOR {
    static int[] smallestSubarrays(int[] nums){
        int n = nums.length;
        int []ans = new int[n];
        int []last = new int[32];

        for(int i = n - 1; i >= 0; i--){
            for(int b = 0; b < 32; b++){
                if(((nums[i] >> b) & 1) == 1){
                    last[b] = i;
                }
            }
            int max = i;
            for(int b = 0; b < 32; b++){
                if(last[b] > max){
                    max = last[b];
                }
            }
            ans[i] = max - i + 1;
        }
        return ans;
    }
    public static void main(String []args)
    {
        int nums[] = {1,0,2,1,3};
        int []ans = smallestSubarrays(nums);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + "  ");
        }
    }
}
