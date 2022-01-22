package geeksForGeeks.POTD._2022.JAN;


import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/distinct-palindromic-substrings5141/1#
 *
 * Given a string str of lowercase ASCII characters, Count the number of distinct
 * continuous palindromic sub-strings which are present in the string str.
 *
 * Example 1:
 *
 * Input:
 * str = "abaaa"
 * Output:
 * 5
 * Explanation : These are included in answer:
 * "a","aa","aaa","aba","b"
 * Example 2:
 *
 * Input
 * str = "geek"
 * Output:
 * 4
 * Explanation : Below are 4 palindrome sub-strings
 * "e","ee","g","k"
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function palindromeSubStrs()
 * which takes the string str as input parameter and returns the total number of distinct continuous palindromic sub-strings in str.
 *
 * Expected Time Complexity : O(N2logN)
 * Expected Auxilliary Space : O(N2)
 *
 * Constraints:
 * 1 ≤ N ≤ 2*103, where N is the length of the string str.
 */
public class _22JAN2022_DistinctPalindromicSubstrings {
    int palindromeSubStrs(String s) {
        // code here
        TreeMap<String, Integer> m = new TreeMap<>();
        int n = s.length();

        int[][] R = new int[2][n + 1];
        s = "@" + s + "#";

        for (int j = 0; j <= 1; j++) {
            int rp = 0;
            R[j][0] = 0;

            int i = 1;
            while (i <= n) {
                while (s.charAt(i - rp - 1) == s.charAt(i +
                        j + rp))
                    rp++;
                R[j][i] = rp;
                int k = 1;
                while ((R[j][i - k] != rp - k) && (k < rp)) {
                    R[j][i + k] = Math.min(R[j][i - k],
                            rp - k);
                    k++;
                }
                rp = Math.max(rp - k, 0);
                i += k;
            }
        }

        s = s.substring(1, s.length() - 1);
        m.put(s.substring(0, 1), 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 1; j++)
                for (int rp = R[j][i]; rp > 0; rp--)
                    m.put(s.substring(i - rp - 1, i - rp - 1
                            + 2 * rp + j), 1);
            m.put(s.substring(i, i + 1), 1);
        }
        return m.size();
    }
}
