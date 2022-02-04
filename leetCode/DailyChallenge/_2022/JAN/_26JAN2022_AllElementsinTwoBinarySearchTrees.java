package leetCode.DailyChallenge._2022.JAN;

import leetCode.problems.TreeNode;
import java.util.*;

/**
 * @docs https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 * Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root1 = [2,1,4], root2 = [1,0,3]
 * Output: [0,1,1,2,3,4]
 * Example 2:
 *
 *
 * Input: root1 = [1,null,8], root2 = [8,1]
 * Output: [1,1,8,8]
 *
 *
 * Constraints:
 *
 * The number of nodes in each tree is in the range [0, 5000].
 * -10^5 <= Node.val <= 10^5
 */
public class _26JAN2022_AllElementsinTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li = new ArrayList<>();
        rec(root1, li);
        rec(root2, li);
        Collections.sort(li);
        return li;
    }

    public void rec(TreeNode root, List<Integer> li) {
        if (root == null) return;
        rec(root.left, li);
        li.add(root.val);
        rec(root.right, li);
    }
}