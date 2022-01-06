package geeksForGeeks.POTD._2022.JAN;

import java.util.Arrays;

/**
 * @docs https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
 *
 * Given a array of N strings, find the longest common prefix among all strings present in the array.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * arr[] = {geeksforgeeks, geeks, geek,
 * geezer}
 * Output: gee
 * Explanation: "gee" is the longest common
 * prefix in all the given strings.
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * arr[] = {hello, world}
 * Output: -1
 * Explanation: There's no common prefix
 * in the given strings.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function longestCommonPrefix() which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".
 * <p>
 * <p>
 * Expected Time Complexity: O(N*max(|arri|)).
 * Expected Auxiliary Space: O(max(|arri|)) for result.
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10^3
 * 1 ≤ |arri| ≤ 10^3
 */
public class _06JAN2022_LongestCommonPrefixInArray {
    String longestCommonPrefix(String[] arr, int n) {

        if (n == 0) return "";
        if (n == 1) return arr[0];
        Arrays.sort(arr);

        String ans = "";

        String a = arr[0];
        String b = arr[n - 1];
        int min = Math.min(a.length(), b.length());

        int i = 0;

        while (i < min) {
            if (a.charAt(i) == b.charAt(i)) ans += a.charAt(i);
            else break;
            i++;
        }

        return ans.equals("") ? "-1" : ans;
    }
}
