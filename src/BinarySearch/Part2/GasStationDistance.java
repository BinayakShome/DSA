package BinarySearch.Part2;

public class GasStationDistance {
    static double minmaxGasDis(int[] stations, int k)
    {
        double left = 0, right = stations[stations.length - 1] - stations[0];
        double epsilon = 1e-6;  // precision
        while (right - left > epsilon) {
            double mid = (left + right) / 2;
            if (canPlace(stations, k, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }

    static boolean canPlace(int[] stations, int k, double maxDist)
    {
        int needed = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            double dist = stations[i + 1] - stations[i];
            needed += (int) (dist / maxDist);
        }
        return needed <= k;
    }
    public static void main(String [] args)
    {
        int[] stations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 9;
        System.out.println(minmaxGasDis(stations,k));
    }
}
