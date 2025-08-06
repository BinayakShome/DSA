package Graph.ApnaCollege;

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
    static ArrayList<Integer> dfsG(int v, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[]visited = new boolean[v+1];
        visited[0] = true;
        dfs(0, visited, adj, ls);
        return ls;
    }
    public static void main(String []args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 7;
        for (int i = 0; i < v; i++) {
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

        ArrayList<Integer> ans = dfsG(v, adj);
        int size = adj.size();
        for(int i = 0; i < size; i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
