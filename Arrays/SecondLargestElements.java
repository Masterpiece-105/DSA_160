package GFG160.Arrays;

public class SecondLargestElements {
    public static void secondLargestNum(int[] arr) {
        int n = arr.length;
        int largestNum = -1;
        int secondLargestNum = -1;

        // largest number
        for (int i = 0; i < n; i++) {

            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        // secondLargest number
        for (int i = 0; i < n; i++) {
            if (secondLargestNum > arr[i] && secondLargestNum != largestNum) {
                secondLargestNum = arr[i];
            }
        }
        System.out.println(secondLargestNum);
    }


    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        secondLargestNum(arr);
    }
}

