package GFG160.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] arr) {
        int res = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxProduct = Math.max(maxProduct * arr[i], arr[i]);
            res = Math.max(res, maxProduct);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
