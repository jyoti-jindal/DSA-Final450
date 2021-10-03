package array;

import java.util.Scanner;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/reverse-a-string/1">Reverse a String</a>
 *
 * You are given a string s. You need to reverse the string.
 * Difficulty Level : Basic
 *
 * Example 1:
 * Input:
 * s = Geeks
 * Output: skeeG
 *
 * Example 2:
 * Input:
 * s = for
 * Output: rof
 *
 * Your Task:
 * You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.
 *
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= |s| <= 10000
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(reverseWord(scan.next()));
    }

    /**
     * TC: O(N), where S is length of string
     * SC: O(1)
     *
     * @param str
     * @return
     */
    public static String reverseWord(String str) {
        // Reverse the string str
        int n = str.length();
        char ch[] = str.toCharArray();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[n - 1 - i];
            ch[n - 1 - i] = temp;
        }
        return new String(ch);
    }

    /**
     * Function to reverse arr[] from
     * start to end
     * Approach: Two Pointer approach
     *
     * @param arr
     */
    static void reverseArray(int arr[]) {
        int temp;
        int start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Function to reverse arr[] from
     * start to end
     * Approach: Recursion
     *
     * @param arr
     */
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

}
