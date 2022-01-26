package geeksForGeeks.POTD._2022.JAN;


import java.util.*;


/**
 * @docs https://practice.geeksforgeeks.org/problems/bbd15e2da95880979ce65acc7360e2c5681664e65520/1
 * <p>
 * In Doraland, people have unique Identity Numbers called D-id. Doraemon owns the most popular gadget shop in Doraland. Since his gadgets are in high demand and he has only K gadgets left he has decided to sell his gadgets to his most frequent customers only. N customers visit his shop and D-id of each customer is given in an array array[ ]. In case two or more people have visited his shop the same number of time he gives priority to the customer with higher D-id. Find the D-ids of people he sells his K gadgets to.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * array[] = {1, 1, 1, 2, 2, 3}
 * K = 2
 * Output:
 * 1 2
 * Explanation:
 * Customers with D-id 1 and 2 are most
 * frequent.
 * Example 2:
 * <p>
 * Input:
 * N = 8
 * array[] = {1, 1, 2, 2, 3, 3, 3, 4}
 * K = 2
 * Output:
 * 3 2
 * Explanation: People with D-id 1 and 2 have
 * visited shop 2 times Therefore, in this
 * case, the answer includes the D-id 2 as 2 > 1.
 * Your Task:
 * You don't need to read input or print anything. Complete the function TopK() which takes array[ ] and integer K as input parameters and returns an array containing D-id of customers he has decided to sell his gadgets to.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 10^5
 * 1 ≤ D-id ≤ 10^4
 */
public class _26JAN2022_GadetsOfDoraland {
    ArrayList<Integer> TopK(ArrayList<Integer> array, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {

            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                int fp = b.getValue().compareTo(a.getValue());
                int sp = b.getKey().compareTo(a.getKey());
                return fp == 0 ? sp : fp;
            }

        });

        ArrayList<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> mp : list) {
            result.add(mp.getKey());
            if (result.size() == k) break;
        }

        return result;
    }
}
