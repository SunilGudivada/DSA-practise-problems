package algoexpert.io.arrays;

import java.util.List;

public class ValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Time: O(n) | Space: O(1)
        if(array == sequence) return true;
        int index = 0;
        for (Integer integer : array) {
            if (index >= sequence.size()) break;
            if (integer.equals(sequence.get(index))) {
                index++;
            }
        }
        return index == sequence.size();
    }
}
