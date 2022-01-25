package leetCode.DailyChallenge._2022.JAN;

/**
 * @docs https://leetcode.com/problems/valid-mountain-array/
 *
 * <p>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [0,3,2,1]
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^4
 */
public class _25JAN2022_validMountainArray {
    public boolean validMountainArray(int[] a) {
        int i = 1;
        while (i < a.length && a[i] > a[i - 1]) i++;
        if (i == 1 || i == a.length) return false;
        while (i < a.length && a[i] < a[i - 1]) i++;
        return i == a.length;
    }
}
