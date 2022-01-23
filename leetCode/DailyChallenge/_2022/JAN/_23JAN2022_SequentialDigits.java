package leetCode.DailyChallenge._2022.JAN;

import java.util.*;

/**
 * @docs https://leetcode.com/problems/sequential-digits/
 *
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 *
 *
 * Example 1:
 *
 * Input: low = 100, high = 300
 * Output: [123,234]
 * Example 2:
 *
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 *
 *
 * Constraints:
 *
 * 10 <= low <= high <= 10^9
 */
public class _23JAN2022_SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String allDigits = "123456789";
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= allDigits.length(); i++) {

            for (int j = 0; j + i <= allDigits.length(); j++) {

                String s = allDigits.substring(j, j + i);

                int num = Integer.parseInt(s);

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }

        }

        return result;
    }
}
