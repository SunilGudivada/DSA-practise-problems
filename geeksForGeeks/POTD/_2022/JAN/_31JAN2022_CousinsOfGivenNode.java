package geeksForGeeks.POTD._2022.JAN;

import geeksForGeeks.trees.Node;

import java.util.*;


/**
 * @docs https://practice.geeksforgeeks.org/problems/cousins-of-a-given-node/1#
 *
 * Given a binary tree and a node, print all cousins of given node in order of their appearance. Note that siblings should not be printed.
 *
 * Example 1:
 *
 * Input :
 *              1
 *            /   \
 *           2     3
 *         /   \  /  \
 *        4    5  6   7
 *
 * Given node : 5
 * Output : 6 7
 * Explanation :
 * Nodes 6 and 7 are on the same level
 * as 5 and have different parents.
 *
 * Example 2 :
 *
 * Input :
 *          9
 *         /
 *        5
 * Given node : 5
 * Output : -1
 * Explanation :
 * There no other nodes than 5 in the same level.
 * Your task :
 * You don't have to read input or print anything. Your task is to complete the function printCousins() which takes the root node of the tree and the node whose cousins need to be found, as input and returns a list containing the cousins of the given node in order of their appearance in the tree. If there is no cousin of the given node, return -1 as the first element of the list.
 *
 * Expected Time Complexity : O(n)
 * Expected Auxiliary Space : O(n)
 *
 * Constraints :
 * 1 <= n <=10^5
 */
public class _31JAN2022_CousinsOfGivenNode {

    public static ArrayList<Integer> printCousins(Node root, Node node_to_find)
    {
        Queue<Node> q = new LinkedList<Node>();

        ArrayList<Integer> list = new ArrayList<>();

        q.add(root);

        boolean flag = false;

        while(!q.isEmpty()){
            int size = q.size();

            if(flag){
                while(!q.isEmpty()){
                    list.add(q.peek().data);
                    q.remove();
                }
                break;
            }

            for(int i=0;i< size;i++){
                Node top = q.peek();
                q.remove();

                assert top != null;
                if(top.left == node_to_find || top.right == node_to_find){
                    flag = true;
                    continue;
                }

                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);
            }
        }

        if(list.size() == 0){
            list.add(-1);
        }

        return list;

    }
}
