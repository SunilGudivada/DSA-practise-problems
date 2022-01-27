package leetCode.DailyChallenge._2022.JAN;

/**
 * @docs https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
 * <p>
 * Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,10,5,25,2,8]
 * Output: 28
 * Explanation: The maximum result is 5 XOR 25 = 28.
 * Example 2:
 * <p>
 * Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
 * Output: 127
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^5
 * 0 <= nums[i] <= 2^31 - 1
 */
public class _27JAN2022_MaximumXORofTwoNumbersArray {
    static class TrieNode {
        TrieNode left, right;

        public TrieNode() {
            left = null;
            right = null;
        }
    }

    //Insert by iteration
    public void insert(TrieNode root, int num) {
        TrieNode curr = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (bit == 0) {
                if (curr.left == null) {
                    curr.left = new TrieNode();
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = new TrieNode();
                }
                curr = curr.right;
            }
        }
    }

    public int getMaxXor(TrieNode root, int num) {
        TrieNode curr = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (bit == 0) {
                if (curr.right != null) {
                    curr = curr.right;
                    maxXor += (1 << i);
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.left != null) {
                    curr = curr.left;
                    maxXor += (1 << i);   //pow(2,i)
                } else {
                    curr = curr.right;
                }
            }
        }

        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int maxXor = Integer.MIN_VALUE;

        for (int num : nums) {
            insert(root, num);
        }

        for (int num : nums) {
            maxXor = Math.max(maxXor, getMaxXor(root, num));
        }

        return maxXor;
    }
}
