package array;

/**
 * <a href="https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/">Maximum and minimum of an array using minimum number of comparisons</a>
 *
 * <b>Maximum and minimum of an array using minimum number of comparisons</b>
 * <p>
 * Write a function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.
 * <p>
 * TODO: Reduce the number of comparisons
 */
public class MinMax {
    public static void main(String[] args) {
        minMax();
    }

    /**
     * No. of comparisons: 2*N
     * TC: O(N)
     * SC: O(1)
     */
    static void minMax() {
        int[] arr = {1, 6, 9, 1, 5, 3, 23, 34};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max Element: " + max);
        System.out.println("Min Element: " + min);
    }
}
