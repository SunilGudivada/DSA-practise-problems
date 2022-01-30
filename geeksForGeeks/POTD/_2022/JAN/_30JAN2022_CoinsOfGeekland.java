package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1
 * In Geekland there is a grid of coins of size N x N. You have to find the maximum sum of coins in any sub-grid of size K x K.
 * Note: Coins of the negative denomination are also possible at Geekland.
 *
 * Example 1:
 *
 * Input: N = 5, K = 3
 * mat[[]] = {1, 1, 1, 1, 1}
 *           {2, 2, 2, 2, 2}
 *           {3, 8, 6, 7, 3}
 *           {4, 4, 4, 4, 4}
 *           {5, 5, 5, 5, 5}
 * Output: 48
 * Explanation: {8, 6, 7}
 *              {4, 4, 4}
 *              {5, 5, 5}
 * has the maximum sum
 *
 * Example 2:
 *
 * Input: N = 1, K = 1
 * mat[[]] = {{4}}
 * Output: 4
 * Your Task:
 * You don't need to read input or print anything. Complete the function Maximum_Sum() which takes the matrix mat[], size of Matrix N, and value K as input parameters and returns the maximum sum.
 *
 * Expected Time Complexity: O(N^2)
 * Expected Auxiliary Space: O(N^2)
 *
 * Constraints:
 * 1 ≤ K ≤ N ≤ 10^3
 * -5*10^5 ≤ mat[i][j] ≤ 5*10^5
 */
public class _30JAN2022_CoinsOfGeekland {

    public int Maximum_Sum(int[][] mat, int N, int K){
        int max=0;
        //prefix matrix
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i-1>=0)
                    mat[i][j]+=mat[i-1][j];
                if(j-1>=0)
                    mat[i][j]+=mat[i][j-1];
                if(i-1>=0 && j-1>=0)
                    mat[i][j]-=mat[i-1][j-1];
            }
        }
        //maxSum find
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int sum=mat[i][j];
                if(i-K>=0)
                    sum-=mat[i-K][j];
                if(j-K>=0)
                    sum-=mat[i][j-K];
                if(i-K>=0 && j-K>=0)
                    sum+=mat[i-K][j-K];

                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
