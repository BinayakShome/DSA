package Platform.LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequence {
    static List<String> repeatedSequence(String dna)
    {
        List<String> result = new ArrayList<>();
        if (dna == null || dna.length() < 10) return result;

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i <= dna.length() - 10; i++) {
            String sub = dna.substring(i, i + 10);

            if (!seen.add(sub)) {
                repeated.add(sub);
            }
        }

        result.addAll(repeated);
        return result;
    }
    public static void main(String []args)
    {
        String DNA = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.print(repeatedSequence(DNA));
    }
}
