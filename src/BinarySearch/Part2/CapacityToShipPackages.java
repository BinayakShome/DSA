package BinarySearch.Part2;

public class CapacityToShipPackages {
static int findDay(int weights[], int capacity)
{
    int day = 1;
    int load = 0;
    int n = weights.length;

    for (int i = 0; i<n; i++)
    {
        if(load + weights[i] >capacity)
        {
            day++;
            load = weights[i];
        }
        else
        {
            load += weights[i];
        }
    }
    return day;
}
    static int leastWeightCapacity(int weights[], int day)
    {
        int low = Integer.MIN_VALUE, high = 0;

        for (int i = 0; i < weights.length; i++)
        {
            high += weights[i];
            low = Math.max(low,weights[i]);
        }

        while (low<=high)
        {
            int mid = (low + high)/2;
            int numberOfDays = findDay(weights,mid);

            if (numberOfDays <= day)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args)
    {
        int weights[] = {5,4,5,2,3,4,5,6}, day = 5;
        System.out.println(leastWeightCapacity(weights,day));
    }
}
