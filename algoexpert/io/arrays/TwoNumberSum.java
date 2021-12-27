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

    public static boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }




}
