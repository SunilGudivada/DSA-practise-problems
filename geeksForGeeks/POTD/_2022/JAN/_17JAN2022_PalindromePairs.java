package geeksForGeeks.POTD._2022.JAN;

/**
 * @docs https://practice.geeksforgeeks.org/problems/palindrome-pairs/1
 * Given an array of strings arr[] of size N, find if there exists 2 strings arr[i] and arr[j]
 * such that arr[i]+arr[j] is a palindrome i.e the concatenation of string arr[i] and arr[j] results into a palindrome.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * arr[] = {"geekf", "geeks", "or","keeg", "abc",
 * "bc"}
 * Output: 1
 * Explanation: There is a pair "geekf"
 * and "keeg".
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * arr[] = {"abc", "xyxcba", "geekst", "or", "bc"}
 * Output: 1
 * Explanation: There is a pair "abc"
 * and "xyxcba".
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function palindromepair() which takes the array arr[], its size N and returns true
 * if palindrome pair exists and returns false otherwise.
 * <p>
 * The driver code itself prints 1 if returned value is true and prints 0 if returned value is false.
 * <p>
 * <p>
 * Expected Time Complexity: O(N*l^2) where l = length of longest string in arr[]
 * Expected Auxiliary Space: O(N*l^2) where l = length of longest string in arr[]
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10^4
 * 1 ≤ |arr[i]| ≤ 10
 */
public class _17JAN2022_PalindromePairs {

    public static boolean pal(String s, String n) {
        StringBuilder in = new StringBuilder(s);
        in.append(n);
        for (int i = 0; i < in.length() / 2; i++)
            if (in.charAt(i) != in.charAt(in.length() - 1 - i))
                return false;
        return true;
    }

    static int palindromepair(int N, String[] arr) {
        for (int i = 0; i < N - 1; i++)
            for (int j = 0; j < N; j++)
                if (pal(arr[i], arr[j]) && i != j)
                    return 1;
        return 0;
    }

}
