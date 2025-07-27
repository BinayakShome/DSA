package Graph.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNUmberofConnectedComponents {
    static int findNumberOfComponent(int V, List<List<Integer>> edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(List<Integer> edge : edges)
        {
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean []visited = new boolean[V];
        int components = 0;

        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                dfs(i, graph, visited);
                components++;
            }
        }
        return components;
    }

    static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String []args)
    {
        int V = 7;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1,2),
                Arrays.asList(2,3),
                Arrays.asList(4,5)
        );
        System.out.println(findNumberOfComponent(V, edges));
    }
}
