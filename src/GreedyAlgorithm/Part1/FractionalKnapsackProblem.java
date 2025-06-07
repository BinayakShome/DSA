package GreedyAlgorithm.Part1;

import java.util.*;

class Item {
    int value, weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsackProblem {
    static double solution(Item[] items, int W)
    {
        Arrays.sort(items, (a, b) -> Double.compare(
                (double)b.value / b.weight,
                (double)a.value / a.weight
        ));

        double totalValue = 0.0;

        for (Item item : items) {
            if (W == 0) break;

            if (item.weight <= W) {
                // Take whole item
                totalValue += item.value;
                W -= item.weight;
            } else {
                // Take fractional part
                totalValue += (double)item.value * W / item.weight;
                W = 0;
            }
        }

        return totalValue;
    }
    public static void main(String []args)
    {
        Item[] items = {
                new Item(100,20),
                new Item(60,10),
                new Item(120,30)
        };
        int w = 50;

        double maxValue = solution(items, w);
        System.out.printf("Maximum value we can obtain = %.2f\n", maxValue);
    }
}
