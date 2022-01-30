package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 * Explanation: After reversing the whole
 * string(not individual words), the input
 * string becomes
 * much.very.program.this.like.i
 * Example 2:
 * <p>
 * Input:
 * S = pqr.mno
 * Output: mno.pqr
 * Explanation: After reversing the whole
 * string , the input string becomes
 * mno.pqr
 * <p>
 * Your Task:
 * You dont need to read input or print anything.
 * Complete the function reverseWords() which takes string S as input parameter and returns a
 * string containing the words in reversed order. Each word in the returning string should also be separated by '.'
 * <p>
 * <p>
 * Expected Time Complexity: O(|S|)
 * Expected Auxiliary Space: O(|S|)
 * <p>
 * <p>
 * Constraints:
 * 1 <= |S| <= 2000
 */
public class _29JAN2022_ReverseWordsInGivenString {
    String reverseWords(String S) {
        String[] ch = S.split("\\.");
        String ans = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            ans += ch[i];
            ans += ".";
        }
        return ans.substring(0, S.length());
    }
}
