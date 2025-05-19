package StackAndQueues.Part3;

import java.util.Stack;

public class NextGreaterElement {
    static int[] nextGreaterElement(int []nums)
    {
        int n = nums.length;
        int nge[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n-1; i>=0; i--)
        {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
    public static void main(String []args)
    {
        int arr[]={3,10,4,2,1,2,6,1,7,2,9};

        int arr2[] = nextGreaterElement(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}