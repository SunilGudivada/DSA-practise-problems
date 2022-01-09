package geeksForGeeks.POTD._2022.JAN;

import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1
 * Given an array of distinct integers, find all the pairs having both negative and positive values of a number in the array.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 8
 * arr[] = {1,3,6,-2,-1,-3,2,7}
 * Output: -1 1 -3 3 -2 2
 * Explanation: 1, 3 and 2 are present
 * pairwise positive and negative. 6 and
 * 7 have no pair.
 * Example 2:
 * <p>
 * Input:
 * n = 3
 * arr[] = {3,2,1}
 * Output: 0
 * Explanation: No such pair exists so the
 * output is 0.
 * <p>
 * Your Task:
 * You do not need to read input or print anything. Complete the function findPairs()
 * which takes the array A[] and the size of the array, n, as input parameters and returns a list of integers denoting the pairs.
 * The pair that appears first in A[] should appear first in the returning list and within the pair the
 * negative integer should appear before positive integer. Return an empty integer list if no such pair exists.
 * <p>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(n)
 * <p>
 * <p>
 * Constraints:
 * 1 <= n <= 10^6
 * -10^6 <= arr[i] <= 10^6
 */
public class _09JAN2022_PositiveNegativePair {
    public static ArrayList<Integer> findPairs(int[] arr, int n) {
        int[] dp = new int[1000001];
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int j : arr) {
            if (dp[Math.abs(j)] == Integer.MAX_VALUE) {
                dp[Math.abs(j)] = Math.abs(j);
            } else {
                int ans = dp[Math.abs(j)];
                list.add(-ans);
                list.add(ans);
            }
        }

        return list;
    }
}
