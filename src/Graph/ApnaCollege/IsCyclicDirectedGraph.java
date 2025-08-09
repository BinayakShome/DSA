package Graph.ApnaCollege;

import java.util.ArrayList;

public class IsCyclicDirectedGraph {
    static boolean check(int node, boolean[] visited, boolean[] recStack, ArrayList<ArrayList<Integer>> adj)
    {
        visited[node] = true;
        recStack[node] = true;

        for(int neighbour : adj.get(node))
        {
            if(!visited[neighbour])
            {
                if(check(neighbour, visited, recStack, adj))
                {
                    return true;
                }
            }else if(recStack[neighbour])
            {
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];

        for(int i = 0; i < v; i++)
        {
            if(!visited[i])
            {
                if(check(i, visited, recStack, adj))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String []args)
    {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(2).add(3);
        adj.get(3).add(0);

        System.out.println(isCyclic(adj, v));
    }
}
