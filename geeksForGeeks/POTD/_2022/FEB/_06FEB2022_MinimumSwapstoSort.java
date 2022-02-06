package geeksForGeeks.POTD._2022.FEB;

import java.util.*;

/**
 * @docs https://practice.geeksforgeeks.org/problems/minimum-swaps/1#
 * Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
 *
 *
 * Example 1:
 *
 * Input:
 * nums = {2, 8, 5, 4}
 * Output:
 * 1
 * Explaination:
 * swap 8 with 4.
 * Example 2:
 *
 * Input:
 * nums = {10, 19, 6, 3, 5}
 * Output:
 * 2
 * Explaination:
 * swap 10 with 3 and swap 19 with 5.
 *
 * Your Task:
 * You do not need to read input or print anything. Your task is to complete the function minSwaps()
 * which takes the nums as input parameter and
 * returns an integer denoting the minimum number of swaps required to sort the array.
 * If the array is already sorted, return 0.
 *
 *
 * Expected Time Complexity: O(nlogn)
 * Expected Auxiliary Space: O(n)
 *
 *
 * Constraints:
 * 1 ≤ n ≤ 10^5
 * 1 ≤ numsi ≤ 106
 */
public class _06FEB2022_MinimumSwapstoSort {
    public int minSwaps(int[] nums)
    {
        // Code here
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(arr[i],i);
        for(int i=0;i<n;i++){
            while(map.get(nums[i])!=i){
                ans++;
                int temp = nums[i];
                nums[i] = nums[map.get(temp)];
                nums[map.get(temp)] = temp;
            }
        }
        return ans;
    }
}
