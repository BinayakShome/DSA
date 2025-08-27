package Platform.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class zero_one_matrix {
    static int[][] updateMatrix(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;

        int [][]visited = new int[n][m];
        int [][]distance = new int[n][m];

        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 0)
                {
                    q.add(new Node(i, j, 0));
                    visited[i][j] = 1;
                }else{
                    visited[i][j] = 0;
                }
            }
        }

        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};

        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            distance[row][col] = steps;

            for(int i = 0;i<4;i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                // check for valid unvisited cell
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && visited[nrow][ncol] == 0)  {
                    visited[nrow][ncol] = 1;
                    q.add(new Node(nrow, ncol, steps+1));
                }
            }
        }
        return distance;
    }
    public static void main(String []args)
    {
        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        int [][] ans = updateMatrix(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Node {
    int first;
    int second;
    int third;
    Node(int _first, int _second, int _third) {
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}