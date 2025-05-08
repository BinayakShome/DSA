package BinarySearch.Part2;

import java.util.Arrays;

public class BookAllocationProblem {
    static boolean isPossible(int[] books, int student, int maxPages)
    {
        int count = 1;
        int currentSum = 0;

        for (int pages : books)
        {
            if (pages > maxPages)
            {
                return false;
            }

            if (currentSum + pages > maxPages)
            {
                count++;
                currentSum = pages;

                if (count > student)
                {
                    return false;
                }
                else
                {
                    currentSum += pages;
                }
            }
        }
        return true;
    }

    static int allocateBooks(int[] books, int students)
    {
        if (books.length<students)
        {
            return -1; /// Not possible
        }

        int start = Arrays.stream(books).max().getAsInt();
        int end = Arrays.stream(books).sum();
        int result = -1;

        while (start <= end)
        {
            int mid = (start + end)/2;

            if (isPossible(books,students,mid))
            {
                result = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return result;
    }
    public static void main(String []args)
    {
        int[] pages = {12,34,67,90};
        int student = 2;
        System.out.println(allocateBooks(pages,student));
    }
}
/// TIME COMPLEXITY:  O(n.log(sum-max))