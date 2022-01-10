package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#
 * <p>
 * A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 4->5->6
 * Output: 457
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 1->2->3
 * Output: 124
 *
 * Your Task:
 * Your task is to complete the function addOne() which takes the head of the linked list as the only argument
 * and returns the head of the modified linked list. The driver code prints the number.
 * Note: The head represents the left-most digit of the number.
 * <p>
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * <p>
 * Constraints:
 * 1 <= N <= 10^1000
 */
public class _10JAN2022_Add1RepresentedasLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static Node addOne(Node head) {
        if (head == null) return head;
        int carry = add(head, 0);
        if (carry > 0) {
            Node n = new Node(1);
            n.next = head;
            head = n;
        }
        return head;
    }

    static int add(Node node, int carryVal) {
        if (node == null) {
            return 1;
        }
        int result = node.data + add(node.next, carryVal);
        if (result == 10) {
            node.data = 0;
            return 1;
        } else {
            node.data = result;
            return 0;
        }
    }
}
