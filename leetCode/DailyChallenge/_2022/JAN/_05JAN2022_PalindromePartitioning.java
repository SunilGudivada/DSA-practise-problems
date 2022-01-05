package leetCode.DailyChallenge._2022.JAN;

import java.util.ArrayList;
import java.util.List;

/**
 * @docs https://leetcode.com/problems/palindrome-partitioning/
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
 *
 * A palindrome string is a string that reads the same backward as forward.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 * Example 2:
 *
 * Input: s = "a"
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 16
 * s contains only lowercase English letters.
 */
public class _05JAN2022_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        dfs(s, 0, result, current);

        return result;

    }

    private void dfs(String s, int position, List<List<String>> result, List<String> current) {
        if (s.length() == position) result.add(new ArrayList<String>(current));

        else {
            for (int i = position; i < s.length(); i++) {
                if (isValidPalindrome(s, position, i)) {
                    current.add(s.substring(position, i + 1));
                    dfs(s, i + 1, result, current);
                    current.remove(current.size() - 1);
                }
            }
        }
    }

    private boolean isValidPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }

        return true;
    }
}
