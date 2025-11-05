package GFG160.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InversionCount {

    public static int inversionCount(Integer[] arr) {

        int n = arr.length;
        Arrays.sort(arr, Collections.reverseOrder());
        int invCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 3,5,  2, 1};
        System.out.println(inversionCount(arr));
    }
}
