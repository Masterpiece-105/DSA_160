package GFG160.Searching;

public class PeakElement {
    public static int peakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > arr[i + 2]) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
//        System.out.println(peakElement(arr));

        int res = peakElement(arr);
        if (res == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
