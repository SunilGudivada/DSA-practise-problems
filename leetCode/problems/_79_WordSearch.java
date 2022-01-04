package leetCode.problems;

/**
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 * Example 2:
 * <p>
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 * Example 3:
 * <p>
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 */
public class _79_WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper(board, i, j, word, 0)) return true;
            }
        }

        return false;

    }

    public boolean helper(char[][] board, int x, int y, String word, int currentIndex) {
        if (currentIndex == word.length()) return true;
        if (x < 0 || x > board.length - 1 || y < 0 || y > board[0].length - 1 || board[x][y] != word.charAt(currentIndex))
            return false;
        board[x][y] = '#';

        boolean result = helper(board, x + 1, y, word, currentIndex + 1) ||
                helper(board, x, y + 1, word, currentIndex + 1) ||
                helper(board, x, y - 1, word, currentIndex + 1) ||
                helper(board, x - 1, y, word, currentIndex + 1);

        board[x][y] = word.charAt(currentIndex);
        return result;

    }
}
