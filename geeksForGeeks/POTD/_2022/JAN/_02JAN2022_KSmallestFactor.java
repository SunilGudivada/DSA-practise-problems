package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/kth-smallest-factor2345/1#
 * GIven two positive integers N and K. You have to find the Kth smallest factor of N. A factor of N is a positive integer which divides N. Output the Kth smallest factor of N if it exists otherwise print -1.
 *
 *
 *
 * Example 1:
 *
 * Input : N = 4 , K = 2
 * Output: 2
 * Explanation:
 * All factors of 4 are 1,2 and 4. Out of
 * these 2 is the 2nd smallest.
 * Example 2:
 *
 * Input : N = 4 , K = 3
 * Output: 4
 * Explanation:
 * All factors of 4 are 1,2 and 4. Out of
 * these 4 is the 3rd smallest.
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function kThSmallestFactor() which takes 2 Integers N and K as input and returns the answer.
 *
 *
 *
 * Expected Time Complexity: O(sqrt(N))
 * Expected Auxiliary Space: O(1)
 *
 *
 *
 * Constraints:
 * 1 <= N <= 10^6
 * 1 <= K <= 10^6
 */
public class _02JAN2022_KSmallestFactor {
    static int kThSmallestFactor(int n, int k) {
        int i = 0;
        for (i = 1; i * i < n; i++) {
            if ((n % i == 0) && (--k == 0)) {
                return i;
            }
        }

        for (i = (int) Math.floor(Math.sqrt(n)); i >= 1; i--) {
            if ((n % i == 0) && (--k == 0)) {
                return n / i;
            }
        }

        return -1;
    }
}