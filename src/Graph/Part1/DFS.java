package Graph.Part1;

import java.util.ArrayList;

public class DFS {
    static void dfs(int node, boolean []visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls)
    {
        visited[node] = true;
        ls.add(node);

        for (int it : adj.get(node))
        {
            if(visited[it] == false)
            {
                dfs(it, visited, adj, ls);
            }
        }
    }
    static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[]visited = new boolean[V+1];
        visited[0] = true;
        dfs(0, visited, adj, ls);
        return ls;
    }
    public static void main(String []args)
    {
        int n = 5; //No. of Nodes
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans = dfsOfGraph(n, adj);
        int size = adj.size();
        for(int i = 0; i < size; i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
