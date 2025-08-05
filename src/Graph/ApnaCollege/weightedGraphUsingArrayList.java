package Graph.ApnaCollege;

import java.util.ArrayList;

public class weightedGraphUsingArrayList {
    static void getNeighbour(ArrayList<ArrayList<int []>> adj, int n)
    {
        for (int[] edge : adj.get(n))
        {
            System.out.println(edge[0]+" - " +edge[1]);
        }
    }
    public static void main(String []args)
    {
        ArrayList<ArrayList<int []>> adj = new ArrayList<>();

        int V = 4;

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new int[]{2, 2});
        adj.get(2).add(new int[]{0, 2});

        adj.get(2).add(new int[]{1, 10});
        adj.get(1).add(new int[]{2, 10});

        adj.get(2).add(new int[]{3, -1});
        adj.get(3).add(new int[]{2, -1});

        adj.get(1).add(new int[]{3, 0});
        adj.get(3).add(new int[]{1, 0});

        getNeighbour(adj, 2);
    }
}
