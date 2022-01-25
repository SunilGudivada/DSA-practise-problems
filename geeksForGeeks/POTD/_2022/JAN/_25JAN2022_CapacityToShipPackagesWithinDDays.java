package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
 * Given an array arr[] of N weights. Find the least weight capacity of a boat to ship all weights within D days.
 * The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].We may not load more weight than the maximum weight capacity of the ship.
 * <p>
 * Note: You have to load weights on the boat in the given order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * arr[] = {1, 2, 1}
 * D = 2
 * Output:
 * 3
 * Explanation:
 * We can ship the weights in 2 days
 * in the following way:-
 * Day 1- 1,2
 * Day 2- 1
 * Example 2:
 * Input:
 * N = 3
 * arr[] = {9, 8, 10}
 * D = 3
 * Output:
 * 10
 * Explanation:
 * We can ship the weights in 3 days
 * in the following way:-
 * Day 1- 9
 * Day 2- 8
 * Day 3- 10
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function leastWeightCapacity()
 * which takes 2 integers N, and D, and an array arr of size N as input and returns the least weight capacity of the boat required.
 * <p>
 * <p>
 * Expected Time Complexity: O(N*log(Sum of weights - max(list of weights))
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ D ≤ N ≤ 105
 * 1 ≤ arr[i] ≤ 500
 */
public class _25JAN2022_CapacityToShipPackagesWithinDDays {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int s = 0, e = 0;
        for (int i = 0; i < N; i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        while (s < e) {
            int mid = s + (e - s) / 2;
            int pieces = 1, sum = 0;
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    pieces++;
                    sum = arr[i];
                } else sum += arr[i];
            }
            if (pieces > D) s = mid + 1;
            else e = mid;
        }
        return s;
    }
}
