package GFG160.Searching;

public class PeakElement_usingBinarySearch {
    public static int peakElement(int[] arr) {
        int n = arr.length;


        // if their is one element then it's a peak
        if (n == 1) {
            return 0;

        }
        // check if there is first element is peak
        if (arr[0] > arr[1]) {
            return 0;
        }
        // check if last elements is peak
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        // Search space for binary search
        int lo = 1, hi = n - 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // If elements at mid is a peak element return mid
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // If next neighbor is greater than peak elements will exists in right SubArray
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }
}
