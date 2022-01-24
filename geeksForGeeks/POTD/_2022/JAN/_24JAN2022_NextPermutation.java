package geeksForGeeks.POTD._2022.JAN;

import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/next-permutation5226/1
 * <p>
 * Implement the next permutation, which rearranges the list of numbers into
 * Lexicographically next greater permutation of list of numbers. If such arrangement is not possible,
 * it must be rearranged to the lowest possible order i.e. sorted in an ascending order.
 * You are given an list of numbers arr[ ] of size N.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 6
 * arr = {1, 2, 3, 6, 5, 4}
 * Output: {1, 2, 4, 3, 5, 6}
 * <p>
 * Explanation: The next permutation of the
 * given array is {1, 2, 4, 3, 5, 6}.
 * Example 2:
 * <p>
 * Input: N = 3
 * arr = {3, 2, 1}
 * Output: {1, 2, 3}
 * <p>
 * Explanation: As arr[] is the last
 * permutation. So, the next permutation
 * is the lowest one.
 * <p>
 * Your Task:
 * You do not need to read input or print anything. Your task is to complete the function nextPermutation() which
 * takes N and arr[ ] as input parameters and returns a list of numbers containing the next permutation.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10000
 */
public class _24JAN2022_NextPermutation {
    static int findlargestK(int[] arr, int N) {
        for (int k = N - 1; k > 0; k--) {
            if (arr[k] > arr[k - 1]) {
                return k - 1;
            }
        }
        return -1;
    }

    static List<Integer> convert(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    static List<Integer> nextPermutation(int N, int[] arr) {
        int k = findlargestK(arr, N);
        if (k == -1) {
            Arrays.sort(arr);
            return convert(arr);
        } else {
            for (int l = N - 1; l > k; l--) {
                if (arr[k] < arr[l]) {
                    int temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;
                    break;
                }
            }
            List<Integer> list = convert(arr);
            Collections.reverse(list.subList(k + 1, N));
            return list;
        }
    }
}
