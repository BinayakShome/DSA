package GreedyAlgorithm.Part1;

import java.util.ArrayList;
import java.util.List;

public class LemonadeChange {
    static boolean lemonadeChange(List<Integer> bills)
    {
        int five = 0;
        int ten = 0;

        for(int i = 0; i < bills.size(); i++)
        {
            if(bills.get(i) == 5)
            {
                five++;
            } else if (bills.get(i) == 10) {
             if (five > 0)
             {
                 five--;
                 ten++;
             }
             else return false;
            }
            else
            {
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        List<Integer> bills = new ArrayList<>();
        bills.add(5);
        bills.add(5);
        bills.add(5);
        bills.add(10);
        bills.add(20);

        System.out.println(lemonadeChange(bills));
    }
}
