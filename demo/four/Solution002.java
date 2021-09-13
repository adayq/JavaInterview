package four;

/**
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 */
public class Solution002 {


    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int left = prices[0];
        int maxRight = 0;
        int max = 0;
        int temp = 0;
        int right;
        for (int i = 0; i <= prices.length; i++) {
            if (i == prices.length) {
                right = 0;
            } else {
                right = prices[i];
            }
            if (right > left && right > maxRight) {
                maxRight = right;
                temp = right - left;
            } else {
                max = max + temp;
                left = right;
                maxRight = right;
            }
        }
        return max;
    }


}