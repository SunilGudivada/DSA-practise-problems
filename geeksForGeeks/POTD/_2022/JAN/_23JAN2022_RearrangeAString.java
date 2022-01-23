package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/rearrange-a-string4100/1#
 * <p>
 * Given a string containing uppercase alphabets and integer digits (from 0 to 9),
 * the task is to print the alphabets in the lexicographical order followed by the sum of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "AC2BEW3"
 * Output: "ABCEW5"
 * Explanation: 2 + 3 = 5 and we print all
 * alphabets in the lexicographical order.
 * Example 2:
 * <p>
 * Input: S = "ACCBA10D2EW30"
 * Output: "AABCCDEW6"
 * Explanation: 0+1+2+3 = 6 and we print all
 * alphabets in the lexicographical order.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function arrangeString()
 * which takes the string S as inputs and returns the modified string.
 * <p>
 * Expected Time Complexity: O(|S|)
 * Expected Auxiliary Space: O(26)
 * <p>
 * Constraints:
 * 1 ≤ |S| ≤ 10^5
 * S contains only upper case alphabets and digits.
 */
public class _23JAN2022_RearrangeAString {
    public String arrangeString(String s) {
        int[] arr = new int[26];
        int sum = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (Character.isDigit(current)) {
                sum += current - '0';
            } else {
                arr[s.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                while (arr[i] != 0) {
                    result.append((char) (i + 'A'));
                    arr[i]--;
                }
            }
        }

        result.append(sum);

        return result.toString();
    }
}
