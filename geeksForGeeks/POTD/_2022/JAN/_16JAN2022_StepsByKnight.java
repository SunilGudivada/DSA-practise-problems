package geeksForGeeks.POTD._2022.JAN;

import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1
 * Given a square chessboard, the initial position of Knight and position of a target.
 * Find out the minimum steps a Knight will take to reach the target position.
 * <p>
 * Note:
 * The initial and the target position co-ordinates of Knight have been given according to 1-base indexing.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=6
 * knightPos[ ] = {4, 5}
 * targetPos[ ] = {1, 1}
 * Output:
 * 3
 * Explanation:
 * <p>
 * Knight takes 3 step to reach from
 * (4, 5) to (1, 1):
 * (4, 5) -> (5, 3) -> (3, 2) -> (1, 1).
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function minStepToReachTarget() which takes the inital position of Knight (KnightPos), the target position of Knight (TargetPos) and the size of the chess board (N) as an input parameters and returns the minimum number of steps required by the knight to reach from its current position to the given target position.
 * <p>
 * <p>
 * Expected Time Complexity: O(N^2).
 * Expected Auxiliary Space: O(N^2).
 * <p>
 * Constraints:
 * 1 <= N <= 1000
 * 1 <= Knight_pos(X, Y), Targer_pos(X, Y) <= N
 */
public class _16JAN2022_StepsByKnight {
    public int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N) {

        boolean[][] vis = new boolean[N + 1][N + 1];

        Queue<int[]> q = new ArrayDeque<>();
        q.add(KnightPos);

        vis[KnightPos[0]][KnightPos[1]] = true;
        int step = 0;

        int[][] dir = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

        while (q.size() > 0) {

            int sz = q.size();

            while (sz-- > 0) {
                int[] pos = q.poll();

                assert pos != null;
                if (pos[0] == TargetPos[0] && pos[1] == TargetPos[1]) {
                    return step;
                }

                for (int i = 0; i < 8; i++) {
                    int r = pos[0] + dir[i][0];
                    int c = pos[1] + dir[i][1];

                    if (r > 0 && r <= N && c > 0 && c <= N && !vis[r][c]) {
                        vis[r][c] = true;
                        q.offer(new int[]{r, c});
                    }
                }

            }
            step++;
        }
        return -1;
    }
}
