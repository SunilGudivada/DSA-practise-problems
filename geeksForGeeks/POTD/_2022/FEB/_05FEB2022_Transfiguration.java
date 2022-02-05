package geeksForGeeks.POTD._2022.FEB;


import java.util.Arrays;

/**
 * @docs https://practice.geeksforgeeks.org/problems/b6b3297ccfb1ad5f66a9c2b92979170417adf114/1
 *
 * Professor McGonagall teaches transfiguration at Hogwarts. She has given Harry the task of changing himself into a cat.
 * She explains that the trick is to analyze your own DNA and change it into the DNA of a cat.
 * The transfigure spell can be used to pick any one character from the DNA string, remove it and insert it in the beginning.
 * Help Harry calculates minimum number of times he needs to use the spell to change himself into a cat.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * A = "GEEKSFORGEEKS"
 * B = "FORGEEKSGEEKS"
 * Output: 3
 * Explanation:The conversion can take place
 * in 3 operations:
 * 1. Pick 'R' and place it at the front,
 * A="RGEEKSFOGEEKS"
 * 2. Pick 'O' and place it at the front,
 * A="ORGEEKSFGEEKS"
 * 3. Pick 'F' and place it at the front,
 * A="FORGEEKSGEEKS"
 * Example 2:
 * <p>
 * Input:
 * A = "ABC"
 * B = "BCA"
 * Output: 2
 * Explanation: The conversion can take place
 * in 2 operations:
 * 1. Pick 'C' and place it at the front,
 * A = "CAB"
 * 2. Pick 'B' and place it at the front,
 * A = "BCA"
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Complete the function transfigure() which takes strings A and B as
 * input parameters and returns the minimum number of spells needed. If it is not possible to convert A to B then return -1.
 * <p>
 * Expected Time Complexity: O(max(|A|, |B|))
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 ≤ |A|, |B| ≤ 105
 * A and B consists of lowercase and uppercase letters of english alphabet only.
 */
public class _05FEB2022_Transfiguration {
    int transfigure(String A, String B) {
        if (A.length() != B.length()) return -1;
        int[] a = new int[256];
        int[] b = new int[256];
        for (int i = 0; i < A.length(); i++) {
            a[(int) A.charAt(i)]++;
            b[(int) B.charAt(i)]++;
        }
        int count = 0;
        if (Arrays.equals(a, b)) {
            int i = A.length() - 1;
            int j = B.length() - 1;
            while (i >= 0) {
                if (A.charAt(i) == B.charAt(j)) j--;
                else count++;
                i--;
            }
        } else return -1;
        return count;
    }
}
