package leetCode.DailyChallenge._2022.FEB;

/**
 * @docs https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public class _01FEB2022_BestTimeSellAndBuy {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int maxprofit = 0;
        int tempProfit = 0;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            tempProfit = price - lsf;
            maxprofit = Math.max(tempProfit, maxprofit);
        }
        return maxprofit;
    }
}
