package geeksForGeeks.POTD._2022.JAN;

import java.util.*;


/**
 * @docs https://practice.geeksforgeeks.org/problems/clone-a-stack-without-using-extra-space/1#
 *  Given elements of a stack, clone the stack without using extra space.
 *
 * Example 1:
 *
 * Input:
 * N = 10
 * st[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7}
 * Output:
 * 1
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function clonestack()
 * which takes the input stack st[], an empty stack cloned[], you have to clone the stack st into stack cloned.
 * The driver code itself prints 1 in the output if the stack st is cloned properly and prints 0 otherwise.
 *
 *
 * Expected Time Complexity: O(N*N)
 * Expected Auxiliary Space: O(1)
 *
 *
 * Constraints:
 * 1 <= N <= 1000
 * 1<= st[i] <= 10^5
 */
public class _11JAN2022_cloneaStackWithoutExtraSpace {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        if (st.isEmpty()) return;

        int top = st.peek();
        st.pop();

        clonestack(st, cloned);
        cloned.push(top);
    }
}
