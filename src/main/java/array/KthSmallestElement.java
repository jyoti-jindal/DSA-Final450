package array;

import java.util.Arrays;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/kth-smallest-element5635">Kth smallest element</a>
 *
 * <b>Given an array arr[] and an integer K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
 * </b>
 *
 * Example 1:
 * Input:
 * N = 6
 * arr[] = 7 10 4 3 20 15
 * K = 3
 * Output : 7
 * Explanation :
 * 3rd smallest element in the given
 * array is 7.
 *
 * Example 2:
 * Input:
 * N = 5
 * arr[] = 7 10 4 20 15
 * K = 4
 * Output : 15
 * Explanation :
 * 4th smallest element in the given
 * array is 15.
 *
 * Your Task:
 * You don't have to read input or print anything.
 * Your task is to complete the function kthSmallest() which takes
 * the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input
 * and returns the Kth smallest element.
 *
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(1)
 *
 * Constraints:
 * 1 <= N <= 105
 * 1 <= arr[i] <= 105
 * 1 <= K <= N
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{7, 10, 4, 3, 20, 15}, 0, 6, 3));
    }

    /**
     * Approach: SOrt the array and find the minimum
     *
     * TC: O(nlogn)
     * SC: O(1)
     *
     * @param arr
     * @param l
     * @param r
     * @param k
     * @return
     */
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
