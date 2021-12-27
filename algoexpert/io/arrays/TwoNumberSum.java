package algoexpert.io.arrays;

import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// https://www.algoexpert.io/questions/Two%20Number%20Sum

public class TwoNumberSum {

    // Time: O(n^2) | Space: O(1)
    public static int[] twoNumberSum(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[2];
    }

    // Time: O(n) | Space: O(n)
    public static int[] twoNumberSum1(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (set.contains(targetSum - current)) {
                return new int[]{targetSum - current, current};
            }
            set.add(current);
        }
        return new int[0];
    }

    // Time: O(nlogn) | Space: O(1)
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        int left = 0;
        int right = array.length - 1;
        Arrays.sort(array);
        while (left < right) {
            if (array[left] + array[right] == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (array[left] + array[right] > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        return new int[0];
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }

    @Test
    void testCase1() {
        int[] output = twoNumberSum1(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    void testCase2() {
        int[] output = twoNumberSum1(new int[]{4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 6));
    }

    @Test
    void testCase3() {
        int[] output = twoNumberSum1(new int[]{4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 1));
    }

    @Test
    void testCase4() {
        int[] output = twoNumberSum1(new int[]{4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue(contains(output, -3));
        assertTrue(contains(output, 6));
    }

    @Test
    void testCase5() {
        int[] output = twoNumberSum1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue(contains(output, 8));
        assertTrue(contains(output, 9));
    }

    @Test
    void testCase6() {
        int[] output = twoNumberSum1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue(contains(output, 3));
        assertTrue(contains(output, 15));
    }

    @Test
    void testCase7() {
        int[] output = twoNumberSum1(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue(contains(output, -5));
        assertTrue(contains(output, 0));
    }

    @Test
    void testCase8() {
        int[] output = twoNumberSum1(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue(contains(output, 210));
        assertTrue(contains(output, -47));
    }

    @Test
    void testCase9() {
        int[] output = twoNumberSum1(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    void testCase10() {
        int[] output = twoNumberSum1(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    void testCase11() {
        int[] output = twoNumberSum1(new int[]{14}, 5);
        assertEquals(0, output.length);
    }

    @Test
    void testCase12() {
        int[] output = twoNumberSum1(new int[]{14}, 5);
        assertEquals(0, output.length);
    }


}
