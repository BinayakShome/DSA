package Graph.ApnaCollege;

import java.util.ArrayList;

public class InitialisingGraph {
    static void getNeighbours(ArrayList<ArrayList<Integer>> adj, int n)
    {
        for (int neighbour : adj.get(n))
        {
            System.out.print(neighbour + "  ");
        }
    }
    public static void main(String []args)
    {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(2).add(1);
        adj.get(1).add(2);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        getNeighbours(adj, 2);
    }
}
