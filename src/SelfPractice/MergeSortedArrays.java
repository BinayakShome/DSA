package SelfPractice;

public class MergeSortedArrays {

    static int[] merge(int []nums1, int []nums2)
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int []ans = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2)
        {
            if(nums1[i] <= nums2[j])
            {
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }

        while(i < n1)
        {
            ans[k++] = nums1[i++];
        }

        while(j < n2)
        {
            ans[k++] = nums2[j++];
        }

        return ans;
    }
    public static void main(String []args)
    {
        int []nums1 = {1,3,5,8,10};
        int []nums2 = {2,4,6,9,11};
        int []ans = merge(nums1, nums2);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + "  ");
        }
    }
}
