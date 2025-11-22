package GFG160.Searching;

public class searchUsing_Single_Binary_Search {
    static int Search(int[] arr, int key) {
        // initialize two pointers
        int l0 = 0, hi = arr.length - 1;

        while (l0 <= hi) {
            int mid = l0 + (hi - l0) / 2;
            // if key fundamental
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] >= arr[l0]) {
                if (key >= arr[l0] && key < arr[mid]) {
                    hi = mid - 1;
                } else {
                    l0 = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[hi]) {
                    l0 = mid + 1;
                } else
                    hi = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(Search(arr, key));
    }
}
