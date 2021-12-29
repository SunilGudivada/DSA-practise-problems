package algoDaily;

import java.util.*;

/**
 * Given an array of numbers, return true if there is a subarray that sums up to a certain number n.
 * <p>
 * A subarray is a contiguous subset of the array. For example the subarray of [1,2,3,4,5] is [1,2,3] or [3,4,5] or [2,3,4] etc.
 * <p>
 * In the above examples, [2, 3] sum up to 5 so we return true. On the other hand, no subarray in [11, 21, 4] can sum up to 9.
 * <p>
 * Can you create a function subarraySum that accomplishes this?
 * <p>
 * Constraints
 * Length of the array <= 100000
 * The values in the array will be between 0 and 1000000000
 * The target sum n will be between 0 and 1000000000
 * The array can be empty
 * Expected time complexity : O(n)
 * Expected space complexity : O(n)
 */
public class _21_ContiguousSubarraySum {

    // Time: O(n^2) | Space: O(1)
    public static boolean subArraySum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += array[j];
                if (sum == target) return true;
            }
        }
        return false;
    }

    // Time: O(n) | Sum: O(1)
    public static boolean optimizedSubArraySum(int[] array, int target) {
        int curr_sum = array[0], start = 0, i;

        for (i = 1; i <= array.length; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > target && start < i - 1) {
                curr_sum -= array[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == target) {
                int p = i - 1;
                System.out.println( "Sum found between indexes " + start + " and " + p);
                return true;
            }

            // Add this element to curr_sum
            if (i < array.length)
                curr_sum += array[i];
        }

        System.out.println("No subarray found");
        return false;

    }

    // Variation Problem: https://leetcode.com/problems/continuous-subarray-sum/
    public static void main(String[] args) {
        System.out.println(optimizedSubArraySum(new int[]{1, 2, 3, 4, 5}, 21));
    }

}
