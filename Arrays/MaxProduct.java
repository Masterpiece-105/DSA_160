package GFG160.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;

        // store product left to right
        int leftToRight = 1;

        // store product right to right
        int rightTOLeft = 1;

        for (int i = 0; i < n; i++){
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightTOLeft == 0)
                rightTOLeft = 1;

            // calculate the product from left index to right
            leftToRight *= arr[i];

            // calculate the product from right index to left
            int j = n - i -1;
            rightTOLeft *= arr[j];
            maxProd = Math.max(leftToRight, Math.max(rightTOLeft, maxProd));

        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
