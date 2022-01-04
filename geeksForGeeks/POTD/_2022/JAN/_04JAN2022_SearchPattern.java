package geeksForGeeks.POTD._2022.JAN;

import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/8dcd25918295847b4ced54055eae35a8501181c1/1
 * Given two strings, one is a text string and other is a pattern string. The task is to print the indexes of all the occurences of pattern string in the text string. For printing, Starting Index of a string should be taken as 1.
 *
 * Example 1:
 *
 * Input:
 * S = "batmanandrobinarebat", pat = "bat"
 * Output: 1 18
 * Explanation: The string "bat" occurs twice
 * in S, one starts are index 1 and the other
 * at index 18.
 * â€‹Example 2:
 *
 * Input:
 * S = "abesdu", pat = "edu"
 * Output: -1
 * Explanation: There's not substring "edu"
 * present in S.
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function search() which takes the string S and the string pat as inputs and returns an array denoting the start indices (1-based) of substring pat in the string S.
 * Note: You don't need to return -1 yourself when there are no possible answers, just return an empty list.
 *
 *
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(|S|).
 *
 *
 * Constraints:
 * 1 ≤ |S| ≤ 10^5
 * 1 ≤ |pat| ≤ |S|
 */
public class _04JAN2022_SearchPattern {
    ArrayList<Integer> search(String pat, String S) {
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < S.length() - pat.length() + 1; i++) {
            if (S.startsWith(pat, i)) {
                v.add(i + 1);
            }
        }
        if (v.size() == 0) {
            v.add(-1);
        }
        return v;
    }

    ArrayList<Integer> optimizedSearch(String pat, String s) {
        int[] lps = new int[pat.length()];

        lps[0] = 0;

        for (int i = 1; i < lps.length; i++) {

            int j = lps[i - 1];

            while (j > 0 && pat.charAt(i) != pat.charAt(j)) {
                j = lps[j - 1];
            }

            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }

        int k = lps.length;

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        int n = s.length();

        while (i < n) {
            if (s.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
            if (j == k) {
                result.add(i - k + 1);
                j = lps[j - 1];
            }
        }

        if (result.size() == 0) {
            result.add(-1);
        }

        return result;
    }
}
