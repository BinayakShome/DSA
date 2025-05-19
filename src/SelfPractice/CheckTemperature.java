package SelfPractice;

import java.util.Stack;

public class CheckTemperature {
    static int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> stack = new Stack<>();
        int []result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++)
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String []args)
    {
        int []temperature = {73,74,75,71,69,72,76,73};
        int []ans = dailyTemperatures(temperature);

        for (int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
