package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1
 *
 * Given two binary max heaps as arrays, merge the given heaps to form a new max heap.
 *
 *
 *
 * Example 1:
 *
 * Input  :
 * n = 4 m = 3
 * a[] = {10, 5, 6, 2},
 * b[] = {12, 7, 9}
 * Output :
 * {12, 10, 9, 2, 5, 7, 6}
 * Explanation :
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function mergeHeaps()
 * which takes the array a[], b[], its size n and m, as inputs and return the merged max heap.
 * Since there can be multiple solutions, therefore, to check for the correctness of your solution,
 * your answer will be checked by the driver code and will return 1 if it is correct, else it returns 0.
 *
 * Expected Time Complexity: O(n.Logn)
 * Expected Auxiliary Space: O(n + m)
 *
 *
 * Constraints:
 * 1 <= n, m <= 10^5
 * 1 <= a[i], b[i] <= 2*10^5
 *
 */
public class _15JAN2022_MergeTwoBinaryHeaps {
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int[] ans = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            ans[k++] = a[i] > b[j] ? a[i++] : b[j++];
        }
        while (i < n) ans[k++] = a[i++];
        while (j < m) ans[k++] = b[j++];
        return ans;
    }
}
