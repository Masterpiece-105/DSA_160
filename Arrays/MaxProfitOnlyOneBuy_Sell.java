package GFG160.Arrays;

public class MaxProfitOnlyOneBuy_Sell {
    static int maxProfit(int[] profit) {
        int n = profit.length;
        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, profit[j] - profit[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] profit = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(profit));
    }
}
