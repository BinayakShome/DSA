package LeetCodeProblems;

public class MaximumPointsFromCard {
    static int maxScore(int[] cardPoints, int k)
    {
        int n = cardPoints.length;
        int total = 0;
        for (int num : cardPoints) total += num;

        int windowSize = n - k;
        int curr = 0;

        for (int i = 0; i < windowSize; i++) {
            curr += cardPoints[i];
        }

        int minSum = curr;

        for (int i = windowSize; i < n; i++) {
            curr += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, curr);
        }

        return total - minSum;
    }
    public static void main(String []args)
    {
        int []arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
}
