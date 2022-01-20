package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1
 * <p>
 * Given a Binary Number B, find its decimal equivalent.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: B = 10001000
 * Output: 136
 * Example 2:
 * <p>
 * Input: B = 101100
 * Output: 44
 * <p>
 * <p>
 * Your Task:
 * You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.
 * <p>
 * <p>
 * Expected Time Complexity: O(K * Log(K)) where K is number of bits in binary number.
 * Expected Space Complexity: O(1)
 * <p>
 * <p>
 * Constraints:
 * 1 <= number of bits in binary number  <= 16
 */
public class _20JAN2022_BinaryToDecimalNumber {
    public int binary_to_decimal(String str) {
        int ans = 0;
        int cnt = 0;

        for (int i = str.length() - 1; i > -1; i--) {
            ans += (str.charAt(i) - '0') * Math.pow(2, cnt);
            cnt++;
        }
        return ans;
    }
}
