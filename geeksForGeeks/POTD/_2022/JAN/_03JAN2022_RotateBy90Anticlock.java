package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1#
 * Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * matrix[][] = [[1 2 3],
 * [4 5 6],
 * [7 8 9]]
 * Output:
 * 3 6 9
 * 2 5 8
 * 1 4 7
 * Your Task:
 * You only need to implement the given function rotate(). Do not read input, instead use the arguments given in the function.
 * <p>
 * Expected Time Complexity: O(N*N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 50
 * 1 <= matrix[][] <= 100
 */
public class _03JAN2022_RotateBy90Anticlock {

    // Time: O(N^2) | Space: O(N) | N -> length of the row
    static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                }
            }
        }

        for (int i = 0; i < rows / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[rows - i - 1];
            matrix[rows - i - 1] = temp;
        }
    }

    // Time: O(N^2) | Space: O(1) | N -> length of the row
    static void spaceOptimizedRotate(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - i][j];
                matrix[N - 1 - i][j] = temp;
            }
        }
    }
}