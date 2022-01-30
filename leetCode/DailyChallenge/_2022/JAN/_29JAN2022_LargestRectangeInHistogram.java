package leetCode.DailyChallenge._2022.JAN;

import java.util.*;

/**
 * @docs https://leetcode.com/problems/rotate-array/
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 * return the area of the largest rectangle in the histogram.
 *
 * Example 1:
 *
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10 units.
 * Example 2:
 *
 * Input: heights = [2,4]
 * Output: 4
 *
 * Constraints:
 *
 * 1 <= heights.length <= 10^5
 * 0 <= heights[i] <= 10^4
 */
public class _29JAN2022_LargestRectangeInHistogram {
    public static int[] prevSmallerIndex(int[] heights){
        int[] prevSmallerIndex = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!stack.empty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            if(stack.empty()){
                prevSmallerIndex[i]=-1;
            }else{
                prevSmallerIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        return prevSmallerIndex;
    }

    public static int[] nextSmallerIndex(int[] heights){
        int[] nextSmallerIndex = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.length-1; i >= 0; i--){
            while(!stack.empty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            if(stack.empty()){
                nextSmallerIndex[i]=heights.length;
            }else{
                nextSmallerIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        return nextSmallerIndex;

    }

    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int[] prevSmallerIndex = prevSmallerIndex(heights);
        int[] nextSmallerIndex = nextSmallerIndex(heights);
        for(int i = 0; i < heights.length; i++){
            maxArea=Math.max(maxArea, (nextSmallerIndex[i]-prevSmallerIndex[i]-1)*heights[i]);
        }
        return maxArea;
    }
}
