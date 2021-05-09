/**
 * You have an array, prices, in which the ith element represents the price of stock on day i.
 *
 * Find the maximum profit if you can perform at most one transaction and you must buy the stock before selling.
 *
 * Example 1:
 *
 *
 * Input: [8,1,4,2,8,9]
 * Output: 8
 * Explanation: Buy on day 1 (price 1), and sell on day 5 (price 9). maximum profit = 9 - 1 = 8.
 *
 * Example 2:
 *
 *
 * Input: [10,9, 8, 7]
 * Output: 0
 * Explanation: No transaction is done. maximum profit = 0.
 */

public class maximizeProfitsInTheStockMarket {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxDifference = 0;

            for (int i=0; i < prices.length; i++){
                if (prices[i] < minPrice){
                    minPrice = prices[i];
                }

                if((prices[i] - minPrice) > maxDifference){
                    maxDifference = prices[i] - minPrice;
                }
            }
            return maxDifference;
        }
    }


