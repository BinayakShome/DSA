package Graph.Extra;

public class FindTheTownJudge {
    static int townJudge(int n, int [][]arr)
    {
        int []trustScore = new int[n + 1];

        for(int[] relation : arr)
        {
            int a = relation[0];
            int b = relation[1];

            trustScore[a]--;
            trustScore[b]++;
        }

        for (int i = 1; i <= n; i++)
        {
            if (trustScore[i] == n - 1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        int n = 3;
        int [][] town = {{1, 3}, {2, 3}};

        System.out.println(townJudge(n, town));
    }
}
