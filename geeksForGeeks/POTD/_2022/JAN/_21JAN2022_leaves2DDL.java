package geeksForGeeks.POTD._2022.JAN;

import geeksForGeeks.trees.Node;

/**
 * @docs https://practice.geeksforgeeks.org/problems/leaves-to-dll/1
 *
 * Given a Binary Tree of size N, extract all its leaf nodes to form a
 * Doubly Link List starting from the left most leaf.
 * Modify the original tree to make the DLL thus removing the leaf nodes from the tree.
 * Consider the left and right pointers of the tree to be the previous and next pointer of the DLL respectively.
 * <p>
 * Example 1:
 * <p>
 * Input :
 * 1
 * /   \
 * 2     3
 * / \   / \
 * 4   5 6   7
 * <p>
 * Output:
 * Modified Tree :
 * 1
 * /   \
 * 2     3
 * <p>
 * Doubly Link List :
 * 4 <-> 5 <-> 6 <-> 7
 * <p>
 * Explanation:
 * The leaf nodes are modified to form the DLL
 * in-place. Thus their links are removed from
 * the tree.
 * Example 2:
 * <p>
 * Input :
 * 1
 * /   \
 * 2     3
 * / \
 * 4   5
 * <p>
 * Output:
 * Modified Tree :
 * 1
 * /
 * 2
 * <p>
 * Doubly Link List :
 * 4 <-> 5 <-> 3
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * Complete the function convertToDLL() which takes root of the given tree as input parameter and returns the head of the doubly link list.
 * <p>
 * Note:
 * The generated output will contain the inorder traversal of the modified tree, the DLL from left to right and the DLL from right to left.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(height of tree)
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10^4
 */
public class _21JAN2022_leaves2DDL {
    Node prev;
    Node head;

    public Node convertToDLL(Node root) {
        // Code here
        if (root == null) return null;

        head = new Node(0);
        prev = head;

        preOrder(root);

        head = head.right;
        head.left = null;

        return head;
    }

    private boolean preOrder(Node root) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            prev.right = root;
            root.left = prev;
            prev = root;
            return true;
        }


        boolean left = preOrder(root.left);
        boolean right = preOrder(root.right);

        if (left) {
            root.left = null;
        }

        if (right) {
            root.right = null;
        }

        return false;
    }
}
