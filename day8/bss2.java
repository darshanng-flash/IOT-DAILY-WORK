/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).*/
package day8;

public class bss2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] leftProfits = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - minPrice);
        }

        int maxProfit = leftProfits[n - 1];
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, leftProfits[i] + (maxPrice - prices[i]));
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        bss2 obj = new bss2();
        System.out.println(obj.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4})); // 6
        System.out.println(obj.maxProfit(new int[]{1, 2, 3, 4, 5})); // 4
        System.out.println(obj.maxProfit(new int[]{7, 6, 4, 3, 1})); // 0
    }

}
