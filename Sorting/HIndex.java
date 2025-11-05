package GFG160.Sorting;

import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;

        // keeping idx till citations [n-1-idx] > idx
        while (idx < n && citations[n - 1 - idx] > idx) {
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
//        int[] citations = {6, 0, 3, 5, 3};
        int[] citations = {5,4,5, 5, 0, 0};

        System.out.println(hIndex(citations));
    }
}
