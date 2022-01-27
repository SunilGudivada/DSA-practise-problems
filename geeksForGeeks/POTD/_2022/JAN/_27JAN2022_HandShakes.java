package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/handshakes1303/1#
 * We have N persons sitting on a round table. Any person can do a handshake with any other person.
 * <p>
 *      1
 * 2         3
 *      4
 * <p>
 * Handshake with 2-3 and 1-4 will cause cross.
 * <p>
 * In how many ways these N people can make handshakes so that no two handshakes cross each other. N would be even.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * Output:
 * 1
 * Explanation:
 * {1,2} handshake is
 * possible.
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Output:
 * 2
 * Explanation:
 * {{1, 2}, {3, 4}} are the
 * two handshakes possible.
 * {{1, 3}, {2, 4}} is another
 * set of handshakes possible.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function count() which takes an integer N as input parameters and returns an integer, the total number of handshakes possible so that no two handshakes cross each other.
 * <p>
 * <p>
 * Expected Time Complexity: O(2^N)
 * Expected Space Complexity: O(1)
 * <p>
 * <p>
 * Constraints:
 * 1 <= N <= 30
 */
public class _27JAN2022_HandShakes {
    static int count(int N) {
        if (N % 2 == 1) return 0;
        return catalan(N / 2);
    }

    static int catalan(int n) {

        if (n <= 1) return 1;

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - i - 1);
        }
        return result;
    }
}
