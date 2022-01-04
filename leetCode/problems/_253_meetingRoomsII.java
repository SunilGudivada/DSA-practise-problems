package leetCode.problems;

import java.util.Arrays;

/**
 *
 * @docs https://leetcode.com/problems/meeting-rooms-ii/
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 * Example 2:
 * <p>
 * Input: intervals = [[7,10],[2,4]]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= intervals.length <= 10^4
 * 0 <= starti < endi <= 10^6
 */
public class _253_meetingRoomsII {

    public static int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; ++i) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int count = 0;
        int len = 0;
        while (i < intervals.length && j < intervals.length) {
            if (start[i] < end[j]) {
                count++;
                i++;
                len = Math.max(len, count);
            } else {
                j++;
                count--;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
        System.out.println(minMeetingRooms(new int[][]{{0, 30}}));
        System.out.println(minMeetingRooms(new int[][]{{0, 30}, {5, 30}}));
    }

}
