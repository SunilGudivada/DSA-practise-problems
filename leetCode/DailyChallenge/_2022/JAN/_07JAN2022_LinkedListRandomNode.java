package leetCode.DailyChallenge._2022.JAN;

import leetCode.problems.ListNode;

import java.util.Random;

/**
 * @docs https://leetcode.com/problems/linked-list-random-node/
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(ListNode head) Initializes the object with the integer array nums.
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input
 * ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * Output
 * [null, 1, 3, 2, 2, 3]
 * <p>
 * Explanation
 * Solution solution = new Solution([1, 2, 3]);
 * solution.getRandom(); // return 1
 * solution.getRandom(); // return 3
 * solution.getRandom(); // return 2
 * solution.getRandom(); // return 2
 * solution.getRandom(); // return 3
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the linked list will be in the range [1, 104].
 * -104 <= Node.val <= 104
 * At most 104 calls will be made to getRandom.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What if the linked list is extremely large and its length is unknown to you?
 * Could you solve this efficiently without using extra space?
 */
public class _07JAN2022_LinkedListRandomNode {
    ListNode head;
    Random rand;

    public _07JAN2022_LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }

    public int getRandom() {
        int nodeIndex = this.rand.nextInt(this.getLength());
        ListNode temp = this.head;
        for (int i = 0; i < nodeIndex; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public int getLength() {
        ListNode temp = this.head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
