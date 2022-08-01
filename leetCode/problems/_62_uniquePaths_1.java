package leetCode.problems;

public class _62_uniquePaths_1 {

    public int solution_recursive(int m, int n) {
        return helper_recursive(m, n, 0, 0);
    }

    public int helper_recursive(int m, int n, int x, int y) {
        if (x == m - 1 || y == n - 1) return 1;
        if (x >= m || y >= n) return 0;

        return helper_recursive(m, n, x + 1, y) + helper_recursive(m, n, x, y + 1);
    }

    public int solution_dp(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public int solution_nCr(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m, n) - 1;
        double ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (N - r + i) / i;
        }

        return (int) ans;

    }

    public static void main(String[] args) {

        _62_uniquePaths_1 obj = new _62_uniquePaths_1();
        System.out.println(obj.solution_recursive(3, 2));
    }
}
