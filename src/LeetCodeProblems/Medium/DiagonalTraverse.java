package LeetCodeProblems.Medium;

public class DiagonalTraverse {
    static int[] traverse(int [][]mat)
    {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0, d = 1;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            r -= d;
            c += d;

            if (r >= m) {
                r = m - 1;
                c += 2;
                d = -d;
            }
            if (c >= n) {
                c = n - 1;
                r += 2;
                d = -d;
            }
            if (r < 0) {
                r = 0;
                d = -d;
            }
            if (c < 0) {
                c = 0;
                d = -d;
            }
        }
        return result;
    }
    public static void main(String []args)
    {
        int [][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int []ans = traverse(mat);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + "  ");
        }
    }
}
