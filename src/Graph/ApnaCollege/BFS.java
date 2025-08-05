package Graph.ApnaCollege;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static ArrayList<Integer> bfstraversal(int v, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean []visited = new boolean[v];

        q.add(4);
        visited[4] = true;

        while(!q.isEmpty())
        {
            int node = q.poll();
            bfs.add(node);

            for(int i : adj.get(node))
            {
                if (visited[i] == false)
                {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
    public static void main(String []args)
    {
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(3).add(5);
        adj.get(5).add(3);

        adj.get(4).add(5);
        adj.get(5).add(4);

        adj.get(5).add(6);
        adj.get(6).add(5);

        ArrayList < Integer > ans = bfstraversal(v, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++)

        {
            System.out.print(ans.get(i) + " ");
        }
    }
}
