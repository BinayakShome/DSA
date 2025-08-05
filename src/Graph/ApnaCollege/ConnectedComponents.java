package Graph.ApnaCollege;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    static int NumberOfComponents(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++)
        {
            if (!visited[i])
            {
                cnt++;
                q.add(i);
                visited[i] = true;

                while(!q.isEmpty())
                {
                    int node = q.poll();
                    for (int j : adj.get(node)) {
                        if (!visited[j]) {
                            visited[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String []args)
    {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);

        adj.get(3).add(4);

        System.out.println(NumberOfComponents(v,adj));
    }
}
