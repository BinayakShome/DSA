package Graph.ApnaCollege;

import java.util.ArrayList;

public class weightedGraphUsingSeparateClass {
    static void getNeighbour(ArrayList<ArrayList<Edge>> adj, int n)
    {
        for(Edge ed : adj.get(n))
        {
            System.out.println("src ->"+ed.src+" desc->"+ed.des+" wt->"+ed.weight);
        }
    }
    public static void main(String []args)
    {
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        int v = 4;
        for (int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<Edge>());
        }

        adj.get(0).add(new Edge(0, 2, 5));
        adj.get(2).add(new Edge(2, 0, 5));

        adj.get(2).add(new Edge(2, 1, 10));
        adj.get(1).add(new Edge(1, 2, 10));

        adj.get(2).add(new Edge(2, 3, -1));
        adj.get(3).add(new Edge(3, 2, -1));

        adj.get(1).add(new Edge(1, 3, -1));
        adj.get(3).add(new Edge(3, 1, -1));

        getNeighbour(adj, 2);
    }
}

class Edge
{
    int src;
    int des;
    int weight;

    Edge(int s, int d, int w)
    {
        this.src = s;
        this.des = d;
        this.weight = w;
    }
}