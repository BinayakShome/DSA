package SelfPractice;

public class prob1 {
    static void index(int []arr, int target)
    {
        int n = arr.length;
        int start = -1;
        int end = -1;
        for(int i = 0; i < n; i++)
        {
            if (arr[i] == target)
            {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        System.out.println(start + ", " + end);
    }
    public static void main(String []args)
    {
        int []arr = {5,7,7,8,8,10};
        int target = 8;
        index(arr, target);
    }
}
