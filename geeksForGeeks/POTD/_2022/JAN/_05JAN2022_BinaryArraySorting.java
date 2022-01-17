package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1#
 * Given a binary array A[] of size N. The task is to arrange the array in increasing order.
 * Note: The binary array contains only 0  and 1.
 *
 *
 * Example 1:
 *
 * Input:
 * 5
 * 1 0 1 1 0
 *
 * Output:
 * 0 0 1 1 1
 *
 * Explanation:
 * After arranging the elements in
 * increasing order, elements will be as
 * 0 0 1 1 1.
 * Example 2:
 *
 * Input:
 * 10
 * 1 0 1 1 1 1 1 0 0 0
 *
 * Output:
 * 0 0 0 0 1 1 1 1 1 1
 *
 * Explanation:
 * After arranging the elements in
 * increasing order, elements will be
 * 0 0 0 0 1 1 1 1 1 1.
 *
 * Your Task: This is a function problem. You only need to complete the function binSort() that takes the array A[] and it's size N as parameters and sorts the array. The printing is done automatically by the driver code.
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 *
 * Constraints:
 * 1 <= N <= 10^6
 * 0 <= A[i] <= 1
 */
public class _05JAN2022_BinaryArraySorting {
    static void binSort(int[] arr, int n)
    {
        int left = 0;
        int right = n-1;

        while(left<=right){
            if(arr[left] ==1 && arr[right] ==0) swap(arr, left++, right--);
            else if(arr[left] ==0) left++;
            else if(arr[right] == 1) right--;
        }
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
