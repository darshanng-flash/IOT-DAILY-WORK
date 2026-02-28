/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */
package day6;

public class buysell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maximum profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        buysell obj = new buysell();
        System.out.println(obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(obj.maxProfit(new int[]{1, 2, 3, 4, 5})); // 4
        System.out.println(obj.maxProfit(new int[]{7, 6, 4, 3, 1})); // 0
    }

}
