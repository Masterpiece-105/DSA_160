
package GFG160.Arrays;

public class MaxProfitRec {
    // Recursive function to find max profit
    static int maxProfitRec(int[] price, int start, int end) {
        int result = 0;

        // Try every possible pair of buy (i) and sell (j)
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {

                // valid transaction if selling price > buying price
                if (price[j] > price[i]) {

                    int curr = (price[j] - price[i])
                            + maxProfitRec(price, start, i - 1)
                            + maxProfitRec(price, j + 1, end);
                    result = Math.max(result, curr);
                }
            }
        }
        return result;
    }

    public static void main(String[] arg) {
       //  int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfitRec(prices, 0, prices.length -1));
    }

}
