package geeksForGeeks.POTD;

import java.util.Stack;

/**
 * @docs https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1#
 *
 * Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like *, /, + and -.
 *
 *
 *
 * Example 1:
 *
 * Input: S = "231*+9-"
 * Output: -4
 * Explanation:
 * After solving the given expression,
 * we have -4 as result.
 * Example 2:
 *
 * Input: S = "123+*8-"
 * Output: -3
 * Explanation:
 * After solving the given postfix
 * expression, we have -3 as result.
 *
 * Your Task:
 * You do not need to read input or print anything. Complete the function evaluatePostfixExpression() that takes the string S denoting the expression as input parameter and returns the evaluated value.
 *
 *
 * Expected Time Complexity: O(|S|)
 * Expected Auixilliary Space: O(|S|)
 *
 *
 * Constraints:
 * 1 ≤ |S| ≤ 105
 *
 * 0 ≤ |Si|≤ 9 (And given operators)
 */
public class _31DEC2021_EvaluationPostfixExpression {
    public static int evaluatePostFix(String s)
    {
        // Your code here
        Stack<Integer> st=new Stack<>();
        int d=0;
        int c=0;

        for(char ch : s.toCharArray())
        {
            if(ch=='+')
            {
                c= st.pop();
                d= st.pop();
                st.push(d+c);
            }
            else if(ch=='-')
            {
                c= st.pop();
                d= st.pop();
                st.push(d-c);
            }
            else  if(ch=='*')
            {
                c= st.pop();
                d= st.pop();
                st.push(d*c);
            }
            else  if(ch=='/' )
            {
                c= st.pop();
                d= st.pop();
                st.push(d/c);
            }

            else
            {
                st.push(ch-'0');
            }
        }
        return st.peek();
    }
}


