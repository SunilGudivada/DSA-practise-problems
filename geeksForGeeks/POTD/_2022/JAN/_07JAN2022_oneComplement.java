package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/1s-complement2819/1#
 * Given an N bit binary number, find the 1's complement of the number.
 * The ones' complement of a binary number is defined as the value obtained by inverting all the bits in the
 * binary representation of the number (swapping 0s for 1s and vice versa).
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * S = 101
 * Output:
 * 010
 *
 * Explanation:
 * We get the output by converting 1's in S
 * to 0 and 0s to 1
 *
 * Example 2:
 *
 * Input:
 * N = 2
 * S = 10
 *
 * Output:
 * 01
 *
 * Explanation:
 * We get the output by converting 1's in S
 * to 0 and 0s to 1
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function onesComplement() which takes the binary string S, its size N as input parameters and returns 1's complement of S of size N.
 *
 *
 * Expected Time Complexity: O(N)
 * Expected Space Complexity: O(N)
 *
 *
 * Constraints:
 * 1<=N<=100
 */
public class _07JAN2022_oneComplement {
    static String onesComplement(String s,int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                result.append(1);
            } else if (s.charAt(i) == '1') {
                result.append(0);
            }
        }
        return result.toString();

    }
}
