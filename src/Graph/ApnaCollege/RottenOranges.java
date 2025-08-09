package Graph.ApnaCollege;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static int oranges(int [][]grid)
    {
        int fresh = 0;
        if(grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.offer(new int[]{i, j});
                }
                if(grid[i][j] != 0)
                {
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;
        int cnt = 0;
        int count_min = 0;

        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        while(!q.isEmpty())
        {
            int size = q.size();
            cnt += size;

            for(int i = 0; i < size; i++)
            {
                int[] point = q.poll();
                for(int j = 0;j<4;j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if(x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0 ||
                            grid[x][y] == 2) continue;

                    grid[x][y] = 2;
                    q.offer(new int[]{x , y});
                }
            }
            if(q.size() != 0)
            {
                count_min++;
            }
        }

        if(fresh == cnt)
        {
            return count_min;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String []args)
    {
        int [][]grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(oranges(grid));
    }
}
