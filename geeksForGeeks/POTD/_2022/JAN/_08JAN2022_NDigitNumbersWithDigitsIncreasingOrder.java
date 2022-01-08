package geeksForGeeks.POTD._2022.JAN;

import java.util.*;

/**
 * Given an integer N, print all the N digit numbers in increasing order,
 * such that their digits are in strictly increasing order(from left to right).
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 1
 * Output:
 * 0 1 2 3 4 5 6 7 8 9
 * Explanation:
 * Single digit numbers are considered to be
 * strictly increasing order.
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * Output:
 * 12 13 14 15 16 17 18 19 23....79 89
 * Explanation:
 * For N = 2, the correct sequence is
 * 12 13 14 15 16 17 18 19 23 and so on
 * up to 89.
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function increasingNumbers() which takes an integer N as an input parameter
 * and return the list of numbers such that their digits are in strictly increasing order.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * <p>
 * Constraints:
 * 1 <= N <= 9
 */
public class _08JAN2022_NDigitNumbersWithDigitsIncreasingOrder {
    private static ArrayList<Integer> output = new ArrayList<>();

    static ArrayList<Integer> increasingNumbers(int N) {
        output.clear();

        if (N == 1) output.add(0);
        helper(0, 0, new char[N]);

        return output;
    }

    private static void helper(int start, int index, char[] ch) {
        if (index == ch.length) {
            output.add(Integer.parseInt(String.valueOf(ch)));
            return;
        }

        for (int i = start + 1; i < 10; i++) {
            ch[index] = (char) ('0' + i);
            helper(i, index + 1, ch);
        }
    }
}
