package Hashing;

import java.util.HashMap;

public class FindIternaryFromTicket {
    static String iternary(HashMap<String, String> tick)
    {
        HashMap<String, String> reverseMap = new HashMap<>();

        for (String key : tick.keySet())
        {
            reverseMap.put(tick.get(key), key);
        }
        for (String key: tick.keySet())
        {
            if(!reverseMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        tickets.put("Bengaluru", "Bhubaneswar");
        tickets.put("Bhubaneswar", "Kolkata");

        String start = iternary(tickets);

        while(tickets.containsKey(start))
        {
            System.out.print(start+" -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
