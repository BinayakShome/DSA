package Graph.ApnaCollege;

import java.util.ArrayList;

public class AllPathFromSrcToTarget {
    static void pathUsingDfs(ArrayList<ArrayList<Integer>> adj, int start, int target, String path, boolean[] visited)
    {
        if (start == target)
        {
            System.out.println(path + target);
            return;
        }

        visited[start] = true;

        for(int neighbor : adj.get(start))
        {
            if (!visited[neighbor]) {
                pathUsingDfs(adj, neighbor, target, path + start + " -> ", visited);
            }
        }
        visited[start] = false;
    }
    public static void main(String []args)
    {
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < v; i++)
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

        int src = 0, tar = 5;

        boolean[] visited = new boolean[v];

        System.out.println("All paths from " + src + " to " + tar + " are:");
        pathUsingDfs(adj, src, tar, "", visited);
    }
}
