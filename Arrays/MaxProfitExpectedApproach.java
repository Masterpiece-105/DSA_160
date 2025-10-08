package GFG160.Arrays;

public class MaxProfitExpectedApproach {
    static int maxProfit(int[] prices){
        int res = 0;

        //Keep on adding the differences between adjacent when the prices a
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i -1]){
                res += prices[i] - prices[i -1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(arr));
    }
}
