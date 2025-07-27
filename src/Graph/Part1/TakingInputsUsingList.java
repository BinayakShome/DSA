package Graph.Part1;

import java.util.ArrayList;
import java.util.List;

public class TakingInputsUsingList {
    public static void main(String []args)
    {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        //edge 1<-->2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 1<-->3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //print
        System.out.println("Print all nodes");
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < adj.get(i).size(); j++)
            {
                System.out.print(adj.get(i).get(j)+"  ");
            }
        }
    }
}
