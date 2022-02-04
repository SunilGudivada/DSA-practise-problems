package geeksForGeeks.POTD._2022.FEB;

/**
 * @docs https://practice.geeksforgeeks.org/problems/shortest-unique-prefix-for-every-word/1#
 * <p>
 * Given an array of words, find all shortest unique prefixes to represent each word in the given array.
 * Assume that no word is prefix of another.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * arr[] = {"zebra", "dog", "duck", "dove"}
 * Output: z dog du dov
 * Explanation:
 * z => zebra
 * dog => dog
 * duck => du
 * dove => dov
 * Example 2:
 * <p>
 * Input:
 * N = 3
 * arr[] =  {"geeksgeeks", "geeksquiz",
 * "geeksforgeeks"};
 * Output: geeksg geeksq geeksf
 * Explanation:
 * geeksgeeks => geeksg
 * geeksquiz => geeksq
 * geeksforgeeks => geeksf
 * Your task:
 * You don't have to read input or print anything.
 * Your task is to complete the function findPrefixes() which takes the array of strings and
 * it's size N as input and returns a list of shortest unique prefix for each word
 * <p>
 * Expected Time Complexity: O(N*length of each word)
 * Expected Auxiliary Space: O(N*length of each word)
 * <p>
 * Constraints:
 * 1 ≤ N, Length of each word ≤ 1000
 */
public class _04FEB2022_ShortestUniquePrefixForEveryWord {
    static String[] findPrefixes(String[] arr, int N) {
        int curr = 0;
        int length = 1;
        String[] str = new String[N];
        while (curr != N) {
            boolean check = false;
            String ans = arr[curr].substring(0, length);
            for (int i = 0; i < N; i++) {
                if (ans.length() <= arr[i].length() && i != curr && ans.equals(arr[i].substring(0, ans.length()))) {
                    length++;
                    check = true;
                    break;
                }
            }
            if (!check) {
                str[curr] = ans;
                length = 1;
                curr++;
            }
        }
        return str;
    }
}
