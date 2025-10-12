package GFG160.Arrays;

import java.util.Arrays;

public class GetMinDiff {

    public static int getMinDiff(int[] arr, int k){
        int n = arr.length;

        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];

        for (int i =1; i<arr.length; i++){
            if(arr[i] - k < 0){
                continue;
            }
            int minH = Math.min(arr[0] +k, arr[i] - k);
            int maxH = Math.max(arr[i-1] + k, arr[n-1] - k);
            res = Math.min(res, maxH - minH);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 10 ,6, 4, 6, 9, 1};
        int k = 7;
        int result = getMinDiff(arr, k);

        System.out.println(result);

    }
}

