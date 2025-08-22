package pattern;

public class pattern15 {
    public static void main(String []args)
    {
        int N = 4;
        int[][] mat = new int[N][N];

        int num = 1;
        for (int d = 0; d < 2 * N - 1; d++) {
            if (d % 2 == 0) {

                int r = Math.min(d, N - 1);
                int c = d - r;
                while (r >= 0 && c < N) {
                    mat[r][c] = num++;
                    r--;
                    c++;
                }
            } else {

                int c = Math.min(d, N - 1);
                int r = d - c;
                while (c >= 0 && r < N) {
                    mat[r][c] = num++;
                    r++;
                    c--;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
