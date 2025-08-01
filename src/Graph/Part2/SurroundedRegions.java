package Graph.Part2;

public class SurroundedRegions {
    static void dfs(int row, int col, int vis[][], char mat[][], int delrow[], int delcol[])
    {
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < 4; i++)
        {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if(nrow >=0 && nrow <n && ncol >= 0 && ncol < m
                    && vis[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
                dfs(nrow, ncol, vis, mat, delrow, delcol);
            }
        }
    }
    static char[][] fill(char[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;

        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1};
        int vis[][] = new int[n][m];

        for(int i = 0; i < m; i++)
        {
            if (vis[0][i] == 0 && mat[0][i] == 'O')
            {
                dfs(0,i,vis,mat,delrow,delcol);
            }
            if(vis[n-1][i] == 0 && mat[n-1][i] == 'O') {
                dfs(n-1,i,vis,mat, delrow, delcol);
            }
        }

        for(int i = 0;i<n;i++) {
            if(vis[i][0] == 0 && mat[i][0] == 'O') {
                dfs(i, 0, vis, mat, delrow, delcol);
            }
            if(vis[i][m-1] == 0 && mat[i][m-1] == 'O') {
                dfs(i, m-1, vis, mat, delrow, delcol);
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j= 0 ;j<m;j++) {
                if(vis[i][j] == 0 && mat[i][j] == 'O')
                    mat[i][j] = 'X';
            }
        }
        return mat;
    }
    public static void main(String []args)
    {
        char mat[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        char [][]ans = fill(mat);
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans[i].length; j++)
            {
                System.out.print(ans[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
