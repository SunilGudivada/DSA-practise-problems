package geeksForGeeks.POTD._2022.JAN;

import java.util.HashMap;

/**
 * @docs https://practice.geeksforgeeks.org/problems/ncr-mod-m-part-10038/1
 * Given 2 integers n and r. You task is to calculate nCr%1000003.
 *
 *
 * Example 1:
 *
 * Input: n = 5, r = 2
 * Output: 10
 * Explanation: 5C2 = 5! / (2! * 3!) = 10
 * Example 2:
 *
 * Input: n = 3, r = 2
 * Output: 3
 * Explanation: 3C2 = 3! / (2! * 1!) = 3
 *
 *
 * Your Task:
 * You don't need to read or print anything. Your task is to complete the function nCr() which takes n and r as input parameter and returns nCr modulo 1000003.
 *
 *
 * Expected Time Complexity: O(m * logmn) where m = 1000003
 * Expected Space Complexity: O(m)
 *
 *
 * Constraints:
 * 1 <= n <= r <= 10^16
 */
public class _28JAN2022_ncr {
    static long mod = 1000003;

    public static int nCr(long n, long r) {
        return (int) lucas(n, r);
    }

    static long binary_expo(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return ans;
    }

    static long mod_inverse(long a) {
        return binary_expo(a, mod - 2);
    }

    static long fermat(long n, long r) {
        if (n < r) return 0;
        if (r == 0 || n == r) return 1;
        if (r == n - 1 || r == 1) return n;
        HashMap<Long, Long> fact = new HashMap<>();
        fact.put((long) 0, (long) 1);
        for (long i = 1; i <= n; i++) {
            long x = (fact.get(i - 1) * i) % mod;
            fact.put(i, x);
        }
        long a = fact.get(n);
        long b = mod_inverse(fact.get(n - r));
        long c = mod_inverse(fact.get(r));
        return ((a * b) % mod * c % mod) % mod;
    }

    static long lucas(long n, long r) {
        if (r == 0) return 1;
        long ni = n % mod, ri = r % mod;
        return (lucas(n / mod, r / mod) * fermat(ni, ri)) % mod;
    }

}
