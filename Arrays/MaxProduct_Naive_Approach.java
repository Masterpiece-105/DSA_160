package GFG160.Arrays;

public class MaxProduct_Naive_Approach {
    public static int maxProduct(int[] arr) {
        int n = arr.length;

        // Initializing result
        int maxProd = arr[0];

        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = i; j < n; j++) {
                mul *= arr[j];

                // updating result every time to keep of track the maximum product
                maxProd = Math.max(maxProd, mul);
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
