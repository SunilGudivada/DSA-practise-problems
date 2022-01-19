package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/maximum-sum-of-increasing-order-elements-from-n-arrays4848/1
 * <p>
 * Given n arrays of size m each.
 * Find maximum sum obtained by selecting a number from each array such that the element selected from
 * the i-th array is more than the element selected from (i-1)-th array. If maximum sum cannot be obtained then return 0.
 * <p>
 * Example 1:
 * <p>
 * â€‹Input : arr[ ] = {{1,7,4,3}, {4,2,5,1}, {9,5,1,8}}
 * Output : 18
 * Explanation:
 * We can select 4 from the first array,
 * 5 from second array and 9 from the third array.
 * <p>
 * â€‹Example 2:
 * <p>
 * Input : arr[ ] = {{9,8,7}, {6,5,4}, {3,2,1}}
 * Output :  0
 * <p>
 * Your Task:
 * This is a function problem. The input is already taken care of by the driver code.
 * You only need to complete the function maximumSum() that takes number of row N, a number of Column M, 2-d array (arr),
 * and return the maximum sum if cannot be obtained then return 0. The driver code takes care of the printing.
 * <p>
 * Expected Time Complexity: O(N*M).
 * Expected Auxiliary Space: O(1).
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N, M ≤ 500
 */
public class _19JAN2022_MaximumSumOfIncreasingArraynElements {
    public static int maximumSum(int n, int m, int[][] arr) {
        int sum = 0;
        int last = Integer.MAX_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            int temp = -1;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > temp && arr[i][j] < last) {
                    temp = arr[i][j];
                }
            }

            if (temp == -1) return 0;

            sum += temp;
            last = temp;
        }


        return sum;
    }
}
