package dev.artisra.topinterview150.arrayandstrings;

/**
 * Solution for the Best Time to Buy and Sell Stock problem.
 * This class provides a method to calculate the maximum profit that can be obtained
 * by buying and selling a stock once, given an array of daily prices.
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">Problem Description on LeetCode</a>
 */
public class BestTimeStock {

    /**
     * Calculates the maximum profit that can be achieved by buying and selling a stock once.
     * The method implements a one-pass approach by keeping track of the minimum price seen
     * and updating the maximum profit possible at each step.
     *
     * @param prices An array of integers where prices[i] represents the stock price on day i
     * @return The maximum profit that can be achieved. Returns 0 if no profit is possible
     *
     * Example:
     * Input: [7,1,5,3,6,4]
     * Output: 5 (buy at 1, sell at 6)
     */
    public int maxProfit(int[] prices) {
        // Tracking min price, and the max profit
        int minSeenPrice = Integer.MAX_VALUE;
        int maxSeenProfit = 0;

        for (int stockPrice : prices) {
            if (stockPrice < minSeenPrice) {
                minSeenPrice = stockPrice;
                continue; // No profit to be calculated
            }

            int profitIfSell = stockPrice - minSeenPrice;
            if (profitIfSell > maxSeenProfit) {
                maxSeenProfit = profitIfSell;
            }
        }

        return maxSeenProfit;
    }
}
