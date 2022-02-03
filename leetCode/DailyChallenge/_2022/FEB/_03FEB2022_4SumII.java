package leetCode.DailyChallenge._2022.FEB;

import java.util.HashMap;

/**
 * @docs https://leetcode.com/problems/4sum-ii/
 * <p>
 * Given four integer arrays nums1, nums2, nums3, and nums4 all of length n,
 * return the number of tuples (i, j, k, l) such that:
 * <p>
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * Output: 2
 * Explanation:
 * The two tuples are:
 * 1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
 * Example 2:
 * <p>
 * Input: nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums1.length
 * n == nums2.length
 * n == nums3.length
 * n == nums4.length
 * 1 <= n <= 200
 * -2^28 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2^28
 */
public class _03FEB2022_4SumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        var pairCountBySum = new HashMap<Integer, Integer>();
        for (var num1 : nums1)
            for (var num2 : nums2)
                pairCountBySum.compute(num1 + num2, (k, sumCount) -> sumCount == null ? 1 : sumCount + 1);

        var fourSumCount = 0;
        for (var num3 : nums3)
            for (var num4 : nums4)
                fourSumCount += pairCountBySum.getOrDefault(-(num3 + num4), 0);

        return fourSumCount;
    }
}
