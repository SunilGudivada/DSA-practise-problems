package geeksForGeeks.POTD;

/**
 * @docs https://practice.geeksforgeeks.org/problems/number-of-coins1824/1#
 *
 * Given a value V and array coins[] of size M, the task is to make the change for V cents,
 * given that you have an infinite supply of each of coins{coins1, coins2, ..., coinsm} valued coins.
 * Find the minimum number of coins to make the change. If not possible to make change then return -1.
 *
 *
 * Example 1:
 *
 * Input: V = 30, M = 3, coins[] = {25, 10, 5}
 * Output: 2
 * Explanation: Use one 25 cent coin
 * and one 5 cent coin
 * Example 2:
 * Input: V = 11, M = 4,coins[] = {9, 6, 5, 1}
 * Output: 2
 * Explanation: Use one 6 cent coin
 * and one 5 cent coin
 *
 * Your Task:
 * You don't need to read input or print anything.
 * Complete the function minCoins() which takes V, M and array coins as input parameters and returns the answer.
 *
 * Expected Time Complexity: O(V*M)
 * Expected Auxiliary Space: O(V)
 *
 * Constraints:
 * 1 ≤ V*M ≤ 10^6
 * All array elements are distinct
 */
public class _29DEC2021_NumberOfCoins {
    public int minCoins(int coins[], int n, int amount) {
        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (i == 0) dp[i][j] = Integer.MAX_VALUE - 1;
            }
        }
        dp[0][0] = 0;

        for (int j = 1; j < amount + 1; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = Integer.MAX_VALUE - 1;
            }
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
}
