package leetCode.DailyChallenge.DEC;

/**
 * Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.
 *
 * Return the length of n. If there is no such n, return -1.
 *
 * Note: n may not fit in a 64-bit signed integer.
 *
 *
 *
 * Example 1:
 *
 * Input: k = 1
 * Output: 1
 * Explanation: The smallest answer is n = 1, which has length 1.
 * Example 2:
 *
 * Input: k = 2
 * Output: -1
 * Explanation: There is no such positive integer n divisible by 2.
 * Example 3:
 *
 * Input: k = 3
 * Output: 3
 * Explanation: The smallest answer is n = 111, which has length 3.
 *
 *
 * Constraints:
 *
 * 1 <= k <= 10^5
 *
 * https://leetcode.com/problems/smallest-integer-divisible-by-k/
 */
public class _30DEC2021_SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {

        if (k % 2 == 0 || k % 5 == 0) return -1;

        int number = 0;

        for (int i = 1; i <= k; i++) {
            number = (number * 10 + 1) % k;
            if (number == 0) return i;
        }
        return -1;
    }
}
