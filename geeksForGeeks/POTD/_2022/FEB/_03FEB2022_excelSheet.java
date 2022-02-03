package geeksForGeeks.POTD._2022.FEB;

/**
 * @docs https://practice.geeksforgeeks.org/problems/excel-sheet5448/1#
 * <p>
 * Given a positive integer N, return its corresponding column title as it would appear in an Excel sheet.
 * For N =1 we have column A, for 27 we have AA and so on.
 * <p>
 * Note: The alphabets are all in uppercase.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 51
 * Output: AY
 * Your Task:
 * Complete the function ExcelColumn() which takes N as input and returns output string.
 * <p>
 * Expected Time Complexity: O(Log(N))
 * Expected Auxiliary Space: O(Log(N))
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10^7
 */
public class _03FEB2022_excelSheet {

    public String excelColumn(int N) {

        StringBuilder result = new StringBuilder();
        while (N > 0) {
            result.append((char) ('A' + (N - 1) % 26));
            N = (N - 1) / 26;
        }

        result.reverse();
        return result.toString();

    }
}
