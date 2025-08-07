package Graph.ApnaCollege;

import java.util.ArrayList;

public class IsCyclicUnDirectedGraph {
    static boolean isCyclicUtil(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (isCyclicUtil(neighbor, node, visited, adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;  // Found a back edge (cycle)
            }
        }

        return false;
    }

    static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v];

        // In case the graph is disconnected
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, -1, visited, adj)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String []args)
    {
        int v = 5;
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

        System.out.println(isCyclic(v, adj));
    }
}
